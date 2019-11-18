package epam.interview.sp.sushant_test_task.api;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.interview.sp.sushant_test_task.api.responses.BasicSwapiGetResponse;
import epam.interview.sp.sushant_test_task.api.responses.PlanetDetails;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseApiURIValidations extends TestSetUp{
	Response response = null;
	RequestSpecification httpRequest;
	BasicSwapiGetResponse baseApiResponse = null;
	/**
	 * Invoke the API Request and obtain the response
	 */
	@BeforeClass
	public void getAPIResponse() {
		RestAssured.baseURI = super.URL;
		httpRequest = RestAssured.given();
		response = httpRequest.get(super.URL);
		baseApiResponse = response.as(BasicSwapiGetResponse.class);
		LOG.debug("API Response \n " + response.prettyPrint());
	}

	
	
	@Test(description="Validate the response code of the API Response")
	public void testResponseCode() {		
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test(description="Validate the status line of the API response.")
	public void testResponseStatusLine() {
		Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
	}
	
	@Test(description="Validate the content type of the API response.")
	public void testResponseContentType() {
		Assert.assertEquals(response.contentType(), "application/json");
	}
	
	@Test(description="Validate the JSON schema of the API response.")
	public void testJsonSchema() {
		File jsonSchema = new File(System.getProperty("user.dir") + "/src/test/resources/jsonSchemaFiles/swapi_get_json_schema2.json");
		
		response.then().assertThat().body(matchesJsonSchema(jsonSchema));
	}
	
	@Test(description="Validate that the value of the count field in the API response matches the total number of planets in the response on all API pages.")
	public void testCountOfResultObjectsMatchesTheCountInApiResponse() {
		BasicSwapiGetResponse baseApiResponseIntermittent = response.as(BasicSwapiGetResponse.class);
		int resultObjectCount = baseApiResponseIntermittent.getResults().size();
		
		String nextPageApiUrl = baseApiResponseIntermittent.getNext();
		while(nextPageApiUrl != null) {
			LOG.debug("Invoking next page URL " + nextPageApiUrl);
			baseApiResponseIntermittent = httpRequest.get(nextPageApiUrl).as(BasicSwapiGetResponse.class);
			resultObjectCount += baseApiResponseIntermittent.getResults().size();
			nextPageApiUrl = baseApiResponseIntermittent.getNext();
		}
		
		Assert.assertEquals(resultObjectCount, Integer.parseInt(baseApiResponseIntermittent.getCount()));
	}
	
	@Test(description="Validate that on the first page of the API response, the value of attribute 'previous' is null.")
	public void testPreviousValueIsNullOnFirstPageOfResponse() {
		Assert.assertEquals(baseApiResponse.getPrevious(), null);
	}
	
	@Test(description="Validate the presence of list of few planet names in the API response.")
	public void testPresenceOfPlanetNamesInTheResponse() {
		String[] expectedPlanetNames = {"Alderaan", "Coruscant", "Mygeeto", "Dantooine", "Dathomir"};
		List<String> actualPlanetNamesList = new ArrayList<String>();
		BasicSwapiGetResponse baseApiResponseIntermittent = response.as(BasicSwapiGetResponse.class);
		String nextPageApiUrl = baseApiResponseIntermittent.getNext();
		for (PlanetDetails result : baseApiResponseIntermittent.getResults()) {
			actualPlanetNamesList.add(result.getName());
		}
		while (nextPageApiUrl != null) {
			baseApiResponseIntermittent = httpRequest.get(nextPageApiUrl).as(BasicSwapiGetResponse.class);
			nextPageApiUrl = baseApiResponseIntermittent.getNext();
			for (PlanetDetails result : baseApiResponseIntermittent.getResults()) {
				actualPlanetNamesList.add(result.getName());
			}
		}
		
		actualPlanetNamesList.containsAll(Arrays.asList(expectedPlanetNames));
	}
}
