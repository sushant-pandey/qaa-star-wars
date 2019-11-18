package epam.interview.sp.sushant_test_task.uivalidation.video;

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
import epam.interview.sp.sushant_test_task.startwars.pages.VideoPage;

public class VideoPageContentValidation extends VideoPageTestSetUp {
	private VideoPage page;
	private Footer footer;
	
	@BeforeClass
	public void openTheUrl() {
		new Browser(browser, super.URL);
		page = new VideoPage();
		page.waitForLoad();
	}
	
	@Test(enabled = true, description = "")
	public void testPresenceOfStarWarsShowSection() {
		Assert.assertTrue(page.presenceOfStarWarsShowHeader());
	}
	
	@Test(enabled = true, description = "")
	public void testContentsOfStarWarsShowSection() {
		Assert.assertTrue(page.presenceOfStarWarsShowImageThumbnail());
		Assert.assertTrue(page.presenceOfStarWarsShowTextDetails());
	}

	@Test(enabled = true, description = "")
	public void testPresenceOfFeaturedVideosSection() {
		Assert.assertTrue(page.presenceOfFeaturedVideosHeader());
	}
	
	@Test(enabled = true, description = "")
	public void testCountOfVideosInFeaturedVideosSection() {
		Assert.assertTrue(page.countOfVideoLinksInFeaturedVideosSection() >= 1);
	}
	
	@Test(enabled = true, description = "")
	public void testPresenceOfBrowseVideosSection() {
		Assert.assertTrue(page.presenceOfBrowseVideosHeader());
	}
	
	@Test(enabled = true, description = "")
	public void testCountOfEpisodesInBrowseVideosSection() {
		Assert.assertTrue(page.countOfEpisodesLinksInBrowseVideosSection() >= 1);
	}
	
	@Test(enabled = true, description = "")
	public void testCountOfVideosInBrowseVideosSection() {
		Assert.assertTrue(page.countOfVideoLinksInBrowseVideosSection() >= 1);
	}
	
	@Test(enabled = true, description = "")
	public void testPresenceOfScienceAndStarWarsSection() {
		Assert.assertTrue(page.presenceOfScienceAndStarWarsHeader());
	}
		
	@Test(enabled = true, description = "")
	public void testContentsOfScienceAndStarWarsSection() {
		Assert.assertTrue(page.presenceOfScienceAndStarWarsThumbnail());
		Assert.assertTrue(page.presenceOfScienceAndStarWarsShowTextDetails());
	}
	
	@Test(enabled = true, description = "")
	public void testPresenceOfOurStarWarsStoriesSection() {
		Assert.assertTrue(page.presenceOfOurStarWarsStoriesHeader());
	}
	
	@Test(enabled = true, description = "")
	public void testContentsOfOurStarWarsStoriesSection() {
		Assert.assertTrue(page.presenceOfOurStarWarsThumbnail());
		Assert.assertTrue(page.presenceOfOurStarWarsStoriesTextDetails());
	}
	
	@AfterClass(alwaysRun = true)
	public void closePage() {
		Browser.close();
	}
}
