package epam.interview.sp.sushant_test_task.uivalidation.homepage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.interview.sp.sushant_test_task.Browser;
import epam.interview.sp.sushant_test_task.TestBase;
import epam.interview.sp.sushant_test_task.startwars.pages.HomePage;

public class ValidatePresenceOfElements extends HomePageTestSetUp {
	private HomePage homePage;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		homePage = new HomePage();
		homePage.waitForLoad();
	}
	
	@Test(enabled=true, description = "Validate that homepage is loaded")
	public void testHomePageIsLoaded() {
		LOG.info("Executing Test Method : testHomePageIsLoaded");
		Assert.assertTrue(homePage.confirm());
	}

	@Test(enabled=true, description = "Validate the Facebook icon is visible at the top of the page.")
	public void testVisibilityOfFacebookIcon() {
		Assert.assertTrue(homePage.isFacebookIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the Instagram icon is visible at the top of the page.")
	public void testVisibilityOfInstagramIcon() {
		Assert.assertTrue(homePage.isInstagramIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the Tumbler icon is visible at the top of the page.")
	public void testVisibilityOfTumblerIcon() {
		Assert.assertTrue(homePage.isTumblerIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the Twitter icon is visible at the top of the page.")
	public void testVisibilityOfTwitterIcon() {
		Assert.assertTrue(homePage.isTwitterIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the YouTube icon is visible at the top of the page.")
	public void testVisibilityOfYoutubeIcon() {
		Assert.assertTrue(homePage.isYoutubeIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the Kids icon is visible at the top of the page.")
	public void testVisibilityOfKidsIcon() {
		Assert.assertTrue(homePage.isKidsIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the search box is visible at the top of the page.")
	public void testVisibilityOfSearchBox() {
		Assert.assertTrue(homePage.isSearchBoxVisible());
	}
	
	@Test(enabled=true, description = "Validate the placeholder text of the searchbox at the top of the page.")
	public void testPlaceHolderValueOfSearchBox() {
		Assert.assertEquals(homePage.getPlaceHolderValueOfSearchBox(), "Search Star Wars");
	}
	
	@Test(enabled=true, description = "Validate the visiblity of the login button at the top of the page")
	public void testVisiblityOfLoginButton() {
		Assert.assertTrue(homePage.presenceOfLoginButton());
	}
	
	@Test(enabled=true, description = "Validate the visibility of the signup button at the top of the page.")
	public void testVisiblityOfSignUpButton() {
		Assert.assertTrue(homePage.presenceOfSignUpButton());
	}
	
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
