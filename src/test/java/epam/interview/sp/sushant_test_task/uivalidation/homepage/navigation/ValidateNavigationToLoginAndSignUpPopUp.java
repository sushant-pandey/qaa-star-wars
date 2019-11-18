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
import epam.interview.sp.sushant_test_task.startwars.pages.LoginPopUpPage;
import epam.interview.sp.sushant_test_task.startwars.pages.SignUpPage;
import epam.interview.sp.sushant_test_task.uivalidation.homepage.HomePageTestSetUp;

public class ValidateNavigationToLoginAndSignUpPopUp extends HomePageTestSetUp {
	private AbstractStartWarsPage page;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		page = new HomePage();
		page.waitForLoad();
	}

	@Test(enabled=true, description="Verify that click on the Login page opens the Login page pop up.")
	public void testNavigationToLoginPopUpPage() {
		LoginPopUpPage popUpPage = page.clickLogInLink();
		Assert.assertTrue(popUpPage.confirm());
		popUpPage.closePopUp();
	}
	
	@Test(enabled=true, description="Verify that click on the Sign Up page opens the Login page pop up.")
	public void testNavigationToSingUpPage() {
		SignUpPage popUpPage = page.clickSignUpLink();
		Assert.assertTrue(popUpPage.confirm());
		popUpPage.closePopUp();
	}
	
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
