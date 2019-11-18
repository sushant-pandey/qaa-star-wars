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

public class ValidateClickingOfFooterLinks extends HomePageTestSetUp {
	private AbstractStartWarsPage page;
	private Footer footer;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		page = new HomePage();
		page.waitForLoad();
		page.getFooter();
		page.pauseForSeconds(15);
	}
	

	@Test(enabled=true, description="Verify that click on the Facebook icon")
	public void testClickingOfFacebookIcon() {
		Assert.assertTrue(page.getFooter().clickFacebookIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Instagram icon")
	public void testClickingOfInstagramIcon() {
		Assert.assertTrue(page.getFooter().clickInstagramIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Tumbler icon")
	public void testClickingOfTumblerIcon() {
		Assert.assertTrue(page.getFooter().clickTumblerIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Twitter icon at the bottom of the page")
	public void testClickingOfTwitterIcon() {
		Assert.assertTrue(page.getFooter().clickTwitterIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the YouTube icon at the bottom of the page")
	public void testClickingOfYoutubeIcon() {
		Assert.assertTrue(page.getFooter().clickYoutubeIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify that click on the Kids icon at the bottom of the page")
	public void testClickingOfKidsIcon() {
		Assert.assertTrue(page.getFooter().clickKidsIcon().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Terms of Use'")
	public void testClickingOfTermsOfUseLink() {
		Assert.assertTrue(page.getFooter().clickTermsOfUseLink().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Additional Content Information'")
	public void testClickingOfAdditionalContentLink() {
		Assert.assertTrue(page.getFooter().clickAdditionalContentInformationLink().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Privacy Policy'")
	public void testClickingOfPrivacyPolicyLink() {
		Assert.assertTrue(page.getFooter().clickPrivacyPolicyLink().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Children’s Online Privacy Policy'")
	public void testClickingOfChildrenOnlinePrivacyPolicyLink() {
		Assert.assertTrue(page.getFooter().clickChildrenOnlinePrivacyPolicyLink().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Your California Privacy Rights' ")
	public void testClickingOfCaliforniaPrivacyRightsLink() {
		Assert.assertTrue(page.getFooter().clickCaliforniaPrivacyRightsLink().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Star Wars at shopDisney' ")
	public void testClickingOfStarWarsAtShopDisneyLink() {
		Assert.assertTrue(page.getFooter().clickShopDisneyLink().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Star Wars Helpdesk' ")
	public void testClickingOfStarWarsHelpDeskLink() {
		Assert.assertTrue(page.getFooter().clickStarWarsHelpDeskLink().validateUrl());
	}
	
	@Test(enabled=true, description="Verify clicking on link 'Interest-Based Ads'")
	public void testClickingOfInternetBasedAdsLink() {
		Assert.assertTrue(page.getFooter().clickInternetBasedAdsLink().validateUrl());
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
