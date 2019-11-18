package epam.interview.sp.sushant_test_task.startwars.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;

public class FilmsPage  extends AbstractStartWarsPage{

	private String URL = "https://www.starwars.com/films";
	private By filmSelectorModuleLocator = By.xpath("//label[contains(@for, 'mobile-film-selector')]");
	
	/**
	 * Wait for the page to load by waiting for the web element to appear
	 */
	@Override
	public WebElement waitForLoad() {
		return findOne(filmSelectorModuleLocator);
	}

	/**
	 *	Confirm the display of the web-element
	 */
	@Override
	public Boolean confirm() {
		return findOne(filmSelectorModuleLocator).isDisplayed();
	}

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
	
	/**
	 * Click the see all link
	 * @return new instance of the FilmsPage class
	 */
	public FilmsPage clickSeeAll() {
		By seeAllLabel = By.xpath("//section[@class='module links_list']/descendant::label[contains(text(), 'See All')]");
		clickOn(seeAllLabel);
		return this;
	}
	
	/**
	 * Get the list of the movies listed in the film selector dropdown
	 * @return list of name of movies
	 */
	public List<String> getListOfMoviesInFilmSelectorSection(){
		List<String> movieList = new ArrayList<String>();
		By movieLinks = By.xpath("//section[@class='module links_list']/descendant::a");
		for(WebElement movie : findAll(movieLinks)) {
			if(!movie.getText().contains("SEE ALL")) {
				System.out.println(movie.getText().trim());
				movieList.add(movie.getText().trim());
			}
		}
		return movieList;
	}
	
	/**
	 * Get the list of the movies displayed as blocks
	 * @return list of the name of movies
	 */
	public List<String> getListOfMoviesInBlockDisplaySection(){
		List<String> movieList = new ArrayList<String>();
		By displayedMovieBlockLinks = By.xpath("//section[@class='module display-view display']/descendant::span[@class='long-title']");
		for(WebElement movie : findAll(displayedMovieBlockLinks)) {			
			movieList.add(movie.getText().trim());
		}
		LOG.debug(movieList.toString());
		return movieList;
	}
}
