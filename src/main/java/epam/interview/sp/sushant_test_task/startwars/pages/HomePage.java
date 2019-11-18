package epam.interview.sp.sushant_test_task.startwars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;

public class HomePage  extends AbstractStartWarsPage{
	
	private By carouselSlidesLoc = By.xpath("//div[@class='carousel']/ul/li");	
	private By latestNewsHeaderTitle = By.xpath("//h2[text()='Latest News']");
	private By latestNewsSlidesLoc = By.xpath("//li[@data-title='Latest News slide']");
	private By latestVideoHeaderTitle = By.xpath("//h2[text()='Latest Video']");
	private By latestVideoSlidesLoc = By.xpath("//li[@data-title='Latest Video slide']");
	
	/**
	 * Wait for the page to load by waiting for the web element to appear
	 */
	@Override
	public WebElement waitForLoad() {
		waitForJQueryInactive();
		return findOne(starWarsLogo);
	}

	/**
	 *	Confirm the display of the web-element
	 */
	@Override
	public Boolean confirm() {
		return findOne(starWarsLogo).isDisplayed();
	}	
	
	/**
	 * Count of the movie slides in the Carousel section
	 * @return count integer
	 */
	public int countOfSlidesInCarouselSection() {		
		return findAll(carouselSlidesLoc).size();
	}
	
	/**
	 * presence of the latest news header
	 * @return true/false
	 */
	public Boolean presenceOfLatestNewsHeader() {
		return findOne(latestNewsHeaderTitle).isDisplayed();
	}
	
	/**
	 * Count the slides in the latest news section
	 * @return count integer
	 */
	public int countOfSlidesInLatestNewsSection() {		
		return findAll(latestNewsSlidesLoc).size();
	}
	
	/**
	 * Validate the presence of latest video header
	 * @return true/false
	 */
	public Boolean presenceOfLatestVideoHeader() {
		return findOne(latestVideoHeaderTitle).isDisplayed();
	}
	
	/**
	 * Count the slides in the latest video section
	 * @return count integer
	 */
	public int countOfSlidesInLatestVideoSection() {		
		return findAll(latestVideoSlidesLoc).size();
	}
}
