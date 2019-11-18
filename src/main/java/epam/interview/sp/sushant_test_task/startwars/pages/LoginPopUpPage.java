package epam.interview.sp.sushant_test_task.startwars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;

public class LoginPopUpPage  extends AbstractStartWarsPage{

	private By searchVideoInput = By.xpath("//input[@type='text'][@placeholder='Search Videos']");
	private By closePopUpLocator = By.id("close");
	private By signInButtonLoc = By.xpath("//button[text()='Sign In']");
	
	/**
	 * Wait for the page to load by waiting for the web element to appear
	 */
	@Override
	public WebElement waitForLoad() {
		return findOne(signInButtonLoc);
	}

	/**
	 *	Confirm the display of the web-element
	 */
	@Override
	public Boolean confirm() {
		return findOne(signInButtonLoc).isDisplayed();
	}
	
	public void closePopUp() {
		clickOn(closePopUpLocator);
	}
}
