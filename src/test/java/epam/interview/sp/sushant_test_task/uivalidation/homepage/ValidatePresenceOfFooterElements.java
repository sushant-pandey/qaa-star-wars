package epam.interview.sp.sushant_test_task.uivalidation.homepage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.interview.sp.sushant_test_task.Browser;
import epam.interview.sp.sushant_test_task.TestBase;
import epam.interview.sp.sushant_test_task.startwars.pages.HomePage;

public class ValidatePresenceOfFooterElements extends HomePageTestSetUp {
	private HomePage homePage;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, URL);
		homePage = new HomePage();
		homePage.waitForLoad();
	}
	

	@Test(enabled=true, description = "Validate the visiblity of Facebook icon in the footer of the page.")
	public void testVisibilityOfFacebookIcon() {
		Assert.assertTrue(homePage.getFooter().isFacebookIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of Instagram icon in the footer of the page.")
	public void testVisibilityOfInstagramIcon() {
		Assert.assertTrue(homePage.getFooter().isInstagramIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of Tumbler icon in the footer of the page.")
	public void testVisibilityOfTumblerIcon() {
		Assert.assertTrue(homePage.getFooter().isTumblerIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of Twitter icon in the footer of the page.")
	public void testVisibilityOfTwitterIcon() {
		Assert.assertTrue(homePage.getFooter().isTwitterIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of YouTube icon in the footer of the page.")
	public void testVisibilityOfYoutubeIcon() {
		Assert.assertTrue(homePage.getFooter().isYoutubeIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of Kids icon in the footer of the page.")
	public void testVisibilityOfKidsIcon() {
		Assert.assertTrue(homePage.getFooter().isKidsIconVisible());
	}
	
	@Test(enabled=true, description = "Validate the visibility of the trademark statement.")
	public void testVisibilityOfTradeMarkStatement() {
		Assert.assertTrue(homePage.getFooter().isTradeMarkStatementVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Terms of Use' link in the footer of the page.")
	public void testVisibilityOfTermsOfUseLink() {
		Assert.assertTrue(homePage.getFooter().isTermsOfUseLinkVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Additional Content Information' link in the footer of the page.")
	public void testVisibilityOfAdditionalContentInformationLink() {
		Assert.assertTrue(homePage.getFooter().isAdditionalContentLinkVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Privacy Policy link' in the footer of the page.")
	public void testVisibilityOfPrivacyPolicyLink() {
		Assert.assertTrue(homePage.getFooter().isPrivacyPolicyLinkVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Children’s Online Privacy Policy' link in the footer of the page.")
	public void testVisibilityOfChildrenOnlinePrivacyPolicyLink() {
		Assert.assertTrue(homePage.getFooter().isChildrenOnlinePrivacyPolicyLinkVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Your California Privacy Rights' link in the footer of the page.")
	public void testVisibilityOfCaliforniaPrivacyRightLink() {
		Assert.assertTrue(homePage.getFooter().isCaliforniaPrivacyRightsLinkVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Star Wars at shopDisney' link in the footer of the page.")
	public void testVisibilityOfStarWarsAtShopDisneyLink() {
		Assert.assertTrue(homePage.getFooter().isStarWarsAtShopDisneyLinkVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Star Wars Helpdesk' link in the footer of the page.")
	public void testVisibilityOfStarWarsHelpDeskLink() {
		Assert.assertTrue(homePage.getFooter().isStarWarsHelpDeskLinkVisible());
	}
	
	@Test(enabled=true, description = "Validate the visiblity of 'Interest-Based Ads' link in the footer of the page.")
	public void testVisibilityOfInternetBasedAdsLink() {
		Assert.assertTrue(homePage.getFooter().isInternetBasedAdsLinkVisible());
	}
	
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
