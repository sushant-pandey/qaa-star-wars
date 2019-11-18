package epam.interview.sp.sushant_test_task.api;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import epam.interview.sp.sushant_test_task.TestBase;

public class TestSetUp extends TestBase{
	protected static String URL = "";
	@BeforeTest
	@Parameters({ "URL" })
	public void beforeTest(@Optional("https://swapi.co/api/planets")String URL) {
		TestSetUp.URL = URL;
	}
}
