package epam.interview.sp.sushant_test_task.uivalidation.films;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.interview.sp.sushant_test_task.Browser;
import epam.interview.sp.sushant_test_task.TestBase;
import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;
import epam.interview.sp.sushant_test_task.startwars.Footer;
import epam.interview.sp.sushant_test_task.startwars.pages.FilmsPage;
import epam.interview.sp.sushant_test_task.startwars.pages.HomePage;
import epam.interview.sp.sushant_test_task.startwars.pages.VideoPage;

public class ValidateContentSection extends FilmTestSetUp {
	private FilmsPage page;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		page = new FilmsPage();
		page.waitForLoad();
	}
	
	@Test(enabled = true, description = "Validate that multiple Star War movies are listed as links in See All section")
	public void testCountOfMoviesListedInSeeAllSection() {
		String[] movieListArray = {"THE PHANTOM MENACE",
				"ATTACK OF THE CLONES",
				"REVENGE OF THE SITH",
				"A NEW HOPE",
				"THE EMPIRE STRIKES BACK",
				"RETURN OF THE JEDI",
				"THE FORCE AWAKENS",
				"THE LAST JEDI",
				"THE RISE OF SKYWALKER",
				"ROGUE ONE",
				"SOLO"};
		List<String> expectedMovieList = new ArrayList<String>(Arrays.asList(movieListArray));
		List<String> actualMovieList = page.clickSeeAll().getListOfMoviesInFilmSelectorSection();
		page.clickSeeAll();
		Collections.sort(expectedMovieList);
		Collections.sort(actualMovieList);
		Assert.assertEquals(expectedMovieList, expectedMovieList);
	}
	
	@Test(enabled = true, description = "Validate that multiple Star War movies are listed as blocks on Films Page")
	public void testCountOfMoviesListedInMovieDisplaySection() {
		String[] movieListArray = {"STAR WARS: THE RISE OF SKYWALKER",
				"SOLO: A STAR WARS STORY",
				"STAR WARS: THE LAST JEDI",
				"ROGUE ONE: A STAR WARS STORY",
				"STAR WARS: THE FORCE AWAKENS",
				"STAR WARS: RETURN OF THE JEDI", 
				"STAR WARS: THE EMPIRE STRIKES BACK", 
				"STAR WARS: A NEW HOPE",
				"STAR WARS: REVENGE OF THE SITH",
				"STAR WARS: ATTACK OF THE CLONES",
				"STAR WARS: THE PHANTOM MENACE"};
		List<String> expectedMovieList = new ArrayList<String>(Arrays.asList(movieListArray));
		List<String> actualMovieList = page.getListOfMoviesInBlockDisplaySection();
		Collections.sort(expectedMovieList);
		Collections.sort(actualMovieList);
		Assert.assertEquals(expectedMovieList, expectedMovieList);
	}
	
	/**
	 * Steps to execute after each test.
	 * Added refresh browser to make sure, if anything fails for one test, other is not affected
	 */
	@AfterMethod
	public void refreshPage() {
		page.refreshBrowser();
		page.waitForLoad();
	}
	
	/**
	 * After Class Method. Close the browser.
	 */
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
