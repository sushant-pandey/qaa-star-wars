package epam.interview.sp.sushant_test_task.uivalidation.homepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import epam.interview.sp.sushant_test_task.TestBase;

public class HomePageTestSetUp extends TestBase  {
	protected static String URL = "";
	@BeforeTest
	@Parameters({ "URL" })
	public void beforeTest(@Optional("https://www.starwars.com/")String URL) {
		this.URL = URL;
	}

}
