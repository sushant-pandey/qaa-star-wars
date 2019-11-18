package epam.interview.sp.sushant_test_task.uivalidation.video;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import epam.interview.sp.sushant_test_task.TestBase;

public class VideoPageTestSetUp extends TestBase  {
	protected String URL = "";
	@BeforeTest
	@Parameters({ "URL" })
	public void beforeTest(@Optional("https://www.starwars.com/video")String URL) {
		this.URL = URL;
	}

}
