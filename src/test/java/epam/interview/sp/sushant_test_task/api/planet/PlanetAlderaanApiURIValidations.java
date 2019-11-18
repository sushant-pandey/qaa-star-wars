package epam.interview.sp.sushant_test_task.api.planet;

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

public class PlanetAlderaanApiURIValidations extends TestSetUp{
	Response response = null;
	RequestSpecification httpRequest;
	PlanetDetails planetDetails = null;
	/**
	 * Invoke the API Request and obtain the response
	 */
	@BeforeClass
	public void getAPIResponse() {
		RestAssured.baseURI = super.URL;
		httpRequest = RestAssured.given();
		response = httpRequest.get(super.URL);
		planetDetails = response.as(PlanetDetails.class);
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
		File jsonSchema = new File(System.getProperty("user.dir") + "/src/test/resources/jsonSchemaFiles/Planet_Details_JsonSchema.json");
		
		response.then().assertThat().body(matchesJsonSchema(jsonSchema));
	}
	
	@Test(description="Validate that the URL attribute in the JSON response matches the URL invoked to get the JSON response.")
	public void testTheUrlInTheResponseBodyMatchesTheInvokedUrl() {
		Assert.assertTrue(planetDetails.getUrl().contains(super.URL));
	}
	
	@Test(description="Verify tha name of the planet in the JSON response")
	public void testNameOfThePlanetInResponse() {
		Assert.assertEquals(planetDetails.getName(), "Alderaan");
	}
}
