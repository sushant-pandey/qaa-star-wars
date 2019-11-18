package epam.interview.sp.sushant_test_task.startwars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;

public class SignUpPage  extends AbstractStartWarsPage{

	private By closePopUpLocator = By.id("close");
	private By createAccountTitleLoc = By.xpath("//h2[text()='Create Your Account']");
	
	/**
	 * Wait for the page to load by waiting for the web element to appear
	 */
	@Override
	public WebElement waitForLoad() {
		return findOne(createAccountTitleLoc);
	}

	/**
	 *	Confirm the display of the web-element
	 */
	@Override
	public Boolean confirm() {
		return findOne(createAccountTitleLoc).isDisplayed();
	}

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public void closePopUp() {
		clickOn(closePopUpLocator);
	}
}
