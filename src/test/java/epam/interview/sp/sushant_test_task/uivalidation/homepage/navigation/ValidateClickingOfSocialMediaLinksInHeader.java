package epam.interview.sp.sushant_test_task.uivalidation.homepage.navigation;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.interview.sp.sushant_test_task.Browser;
import epam.interview.sp.sushant_test_task.TestBase;
import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;
import epam.interview.sp.sushant_test_task.startwars.pages.HomePage;
import epam.interview.sp.sushant_test_task.uivalidation.homepage.HomePageTestSetUp;

public class ValidateClickingOfSocialMediaLinksInHeader extends HomePageTestSetUp {
	private AbstractStartWarsPage page;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		page = new HomePage();
		page.waitForLoad();
	}
	
	@Test(enabled=true, description="Verify that click on the Facebook icon on the top of the page")
	public void testClickingOfFacebookIcon() {
		Assert.assertTrue(page.clickFacebookIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Instagram icon on the top of the page")
	public void testClickingOfInstagramIcon() {
		Assert.assertTrue(page.clickInstagramIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Tumbler icon on the top of the page")
	public void testClickingOfTumblerIcon() {
		Assert.assertTrue(page.clickTumblerIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Twitter icon on the top of the page")
	public void testClickingOfTwitterIcon() {
		Assert.assertTrue(page.clickTwitterIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the YouTube icon on the top of the page")
	public void testClickingOfYouTubeIcon() {
		Assert.assertTrue(page.clickYoutubeIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Kids icon on the top of the page")
	public void testClickingOfKidsDisneyIcon() {
		Assert.assertTrue(page.clickKidsIcon().validateUrl());
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeNewWindowOrTab() {
		Browser.closeCurrentWindow();
		page.switchWindow();
	}
	
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
