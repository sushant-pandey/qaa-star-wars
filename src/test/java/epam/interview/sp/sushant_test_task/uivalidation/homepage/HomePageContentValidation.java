package epam.interview.sp.sushant_test_task.uivalidation.homepage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.interview.sp.sushant_test_task.Browser;
import epam.interview.sp.sushant_test_task.TestBase;
import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;
import epam.interview.sp.sushant_test_task.startwars.Footer;
import epam.interview.sp.sushant_test_task.startwars.pages.HomePage;

public class HomePageContentValidation extends HomePageTestSetUp {
	private HomePage page;
	private Footer footer;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		page = new HomePage();
		page.waitForLoad();
	}
	
	@Test(enabled = true, description = "Validate presence of the multiple video slides in carousel section on the Home Page.")
	public void testPresenceOfMultipleSlidesInCarouselSection() {
		Assert.assertTrue(page.countOfSlidesInCarouselSection() >= 1);
	}

	@Test(enabled = true, description = "Validate the presence of the Latest News Section on the Home page.")
	public void testPresenceOfLatestNewsSection() {
		Assert.assertTrue(page.presenceOfLatestNewsHeader());
	}
	
	@Test(enabled = true, description = "Validate the presence of the multiple slides in the latest news section on the Home Page.")
	public void testPresenceOfMultipleSlidesInLatestNewsSection() {
		Assert.assertTrue(page.countOfSlidesInLatestNewsSection() >= 1);
	}
	
	@Test(enabled = true, description = "Validate the presence of the Latest Video section on the Home page")
	public void testPresenceOfLatestVideoSection() {
		Assert.assertTrue(page.presenceOfLatestVideoHeader());
	}
	
	@Test(enabled = true, description = "Validate the presence of the multiple video slides in the Latest Video section on the Home Page.")
	public void countOfSlidesInLatestVideoSection() {
		Assert.assertTrue(page.countOfSlidesInLatestVideoSection() >= 1);
	}
	
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
