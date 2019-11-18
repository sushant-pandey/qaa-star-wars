package epam.interview.sp.sushant_test_task.uivalidation.homepage.navigation;

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
import epam.interview.sp.sushant_test_task.uivalidation.homepage.HomePageTestSetUp;

public class ValidateNavigationToTabs extends HomePageTestSetUp {
	private AbstractStartWarsPage page;
	private Footer footer;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		page = new HomePage();
		page.waitForLoad();
		//page.pauseForSeconds(15);
	}
	

	@Test(enabled=true, description="Validate the navigation to News and blog page")
	public void testNavigationToNewsAndBlogPage() {
		Assert.assertTrue(page.goToNewsAndBlogPage().validateUrl());
	}
	
	@Test(enabled=true, description="Validate the navigation to Video page")
	public void testNavigationToVideoPage() {
		Assert.assertTrue(page.goToVideoPage().validateUrl());
	}
	
	@Test(enabled=true, description="Validate the navigation to Films page")
	public void testNavigationToFilmsPage() {
		Assert.assertTrue(page.goToFilmsPage().validateUrl());
	}
	
	@Test(enabled=true, description="Validate the navigation to Series page")
	public void testNavigationToSeriesPage() {
		Assert.assertTrue(page.goToSeriesPage().validateUrl());
	}
	
	@Test(enabled=true, description="Validate the navigation to Interactive page")
	public void testNavigationToInteractivePage() {
		Assert.assertTrue(page.goToInteractivePage().validateUrl());
	}
	
	@Test(enabled=true, description="Validate the navigation to Community page")
	public void testNavigationToCommunityPage() {
		Assert.assertTrue(page.goToCommunityPage().validateUrl());
	}
	
	@Test(enabled=true, description="Validate the navigation to Databank page")
	public void testNavigationToDataBankPage() {
		Assert.assertTrue(page.goToDatabankPage().validateUrl());
	}
		
	@AfterMethod(alwaysRun = true)
	public void closeNewWindowOrTab() {
		page.goToHomePage();
	}
	
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
