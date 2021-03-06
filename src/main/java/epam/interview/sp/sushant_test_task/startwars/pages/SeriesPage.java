package epam.interview.sp.sushant_test_task.startwars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;

public class SeriesPage  extends AbstractStartWarsPage{

	private String URL = "https://www.starwars.com/series";
	private By activeTVShowContentLocator = By.xpath("//a[@itemprop='url'][@class='section-link tvshows-content active']");
	
	/**
	 * Wait for the page to load by waiting for the web element to appear
	 */
	@Override
	public WebElement waitForLoad() {
		return findOne(activeTVShowContentLocator);
	}

	/**
	 *	Confirm the display of the web-element
	 */
	@Override
	public Boolean confirm() {
		return findOne(activeTVShowContentLocator).isDisplayed();
	}

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
}
