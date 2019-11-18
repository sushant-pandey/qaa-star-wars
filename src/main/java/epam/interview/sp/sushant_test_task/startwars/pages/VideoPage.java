package epam.interview.sp.sushant_test_task.startwars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import epam.interview.sp.sushant_test_task.startwars.AbstractStartWarsPage;

public class VideoPage  extends AbstractStartWarsPage{

	private String URL = "https://www.starwars.com/video";
	private By searchVideoInput = By.xpath("//input[@type='text'][@placeholder='Search Videos']");
	private By starWarsShowSectionHeader = By.xpath("//h2[contains(text(), 'THE STAR WARS SHOW //')]");
	
	private By starWarsShowDetailsHeader = By.xpath("//a/span[text()='The Star Wars Show']");
	private By starWarsShowDetailsText = By.xpath("//a[@data-slug='the-star-wars-show']/p");
	private String expectedStarWarsShowText = "The only weekly 7(ish) minute look at Star Wars from inside Lucasfilm headquarters featuring news, behind-the-scenes features, special guests and more!";


	private By featuredVideoSectionHeaderLoc = By.xpath("//h2[contains(text(), 'Featured Videos //')]");
	private By featuredVideos = By.xpath("//h2[contains(text(), 'Featured Videos //')]/ancestor::section/descendant::ul/div");
	private By browseVideoSectionHeaderLoc = By.xpath("//h2[contains(text(), 'Browse Videos //')]");
	private By browseVideosEpisodes = By.xpath("//h2[contains(text(), 'Browse Videos //')]/ancestor::section/descendant::li[@class='filter-name']");
	private By browseVideosEpisodesBlocks = By.xpath("//h2[contains(text(), 'Browse Videos //')]/ancestor::section/descendant::ul[contains(@class, 'blocks-list-view')]/div");
	private By scienceSectionHeaderLoc = By.xpath("//h2[contains(text(), 'SCIENCE AND STAR WARS //')]");
	private By starWarsShowImageThumbnail = By.xpath("//a/img[@alt='Science and Star Wars']");
	
	private By scienceAndStarWarsDetailsHeader = By.xpath("//a/span[text()='Science and Star Wars']");
	private By scienceAndStarWarsDetailsText = By.xpath("//a[@data-slug='science-and-star-wars']/p");
	private String expectedScienceAndStarWarsDetailsText = "A new show from Disney Digital Network and Lucasfilm, Science and Star Wars will take a look at the relationship between real-world science and Star Wars technology. Paid for by IBM.";
		
	private By ourStoryHeaderLoc = By.xpath("//h2[contains(text(), 'OUR STAR WARS STORIES //')]");
	private By ourStarWarStoryImageThumbnail = By.xpath("//a/img[@alt='Our Star Wars Stories']");
	
	private By ourStarWarStoryDetailsHeader = By.xpath("//a/span[text()='Our Star Wars Stories']");
	private By ourStarWarStoryDetailsText = By.xpath("//a[@data-slug='our-star-wars-stories']/p");
	private String expectedOurStarWarStoryDetailsText = "Introducing Our Star Wars Stories, the new digital series from Lucasfilm in which Jordan Hembrough travels the country talking to fans about how Star Wars has impacted their lives.";
	
	/**
	 * Wait for the page to load by waiting for the web element to appear
	 */
	@Override
	public WebElement waitForLoad() {
		return findOne(searchVideoInput);
	}

	/**
	 *	Confirm the display of the web-element
	 */
	@Override
	public Boolean confirm() {
		return findOne(searchVideoInput).isDisplayed();
	}

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
	
	/**
	 * validate the presence of the header : THE STAR WARS SHOW //
	 * @return true if the header is displayed
	 */
	public Boolean presenceOfStarWarsShowHeader() {		
		return findOne(starWarsShowSectionHeader).isDisplayed();
	}
	
	/**
	 * Validate the presence of the thumbnail for Star Wars Show
	 * @return true/false
	 */
	public Boolean presenceOfStarWarsShowImageThumbnail() {
		By starWarsShowImageThumbnail = By.xpath("//a/img[@alt='The Star Wars Show']");
		return findOne(starWarsShowImageThumbnail).isDisplayed();
	}
	
	/**
	 * Validate the text section for Star Wars Show Thumbnail
	 * @return true if the text matches
	 */
	public Boolean presenceOfStarWarsShowTextDetails() {		
		return findOne(starWarsShowDetailsHeader).isDisplayed() &&
				findOne(starWarsShowDetailsText).getText().contains(expectedStarWarsShowText);
	}
	
	/**
	 * Validate the presence of the header : Featured Videos //
	 * @return true / false
	 */
	public Boolean presenceOfFeaturedVideosHeader() {	
		return findOne(featuredVideoSectionHeaderLoc).isDisplayed();
	}
		
	/**
	 * Count the video is in the featured video section
	 * @return count integer
	 */
	public int countOfVideoLinksInFeaturedVideosSection() {
		return findAll(featuredVideos).size();
	}
	
	/**
	 * Validate the presence of header ; Browse Videos //
	 * @return true/false
	 */
	public Boolean presenceOfBrowseVideosHeader() {
		return findOne(browseVideoSectionHeaderLoc).isDisplayed();
	}
	
	/**
	 * Count the episodes in the Browse videos section
	 * @return count integer
	 */
	public int countOfEpisodesLinksInBrowseVideosSection() {
		return findAll(browseVideosEpisodes).size();
	}
	
	/**
	 * Count the block video links in the browse video section
	 * @return
	 */
	public int countOfVideoLinksInBrowseVideosSection() {
		return findAll(browseVideosEpisodesBlocks).size();
	}
	
	/**
	 * Validate the presence of the header : SCIENCE AND STAR WARS //
	 * @return true / false
	 */
	public Boolean presenceOfScienceAndStarWarsHeader() {
		return findOne(scienceSectionHeaderLoc).isDisplayed();
	}
	
	/**
	 * Validate the presence of the thumbnail in the Science and Star wars section
	 * @return true if the thumbnail is present
	 */
	public Boolean presenceOfScienceAndStarWarsThumbnail() {
		return findOne(starWarsShowImageThumbnail).isDisplayed();
	}
	
	/**
	 * Validate the text in Science and Star Wars Section
	 * @return true / false
	 */
	public Boolean presenceOfScienceAndStarWarsShowTextDetails() {
		return findOne(scienceAndStarWarsDetailsHeader).isDisplayed() &&
				findOne(scienceAndStarWarsDetailsText).getText().
				contains(expectedScienceAndStarWarsDetailsText);
	}
	
	/**
	 * Validate the presence of header : OUR STAR WARS STORIES //
	 * @return true / false
	 */
	public Boolean presenceOfOurStarWarsStoriesHeader() {
		return findOne(ourStoryHeaderLoc).isDisplayed();
	}
	
	/**
	 * Validate the thumbnail in Our Star Wars stories section
	 * @return true / false
	 */
	public Boolean presenceOfOurStarWarsThumbnail() {
		return findOne(ourStarWarStoryImageThumbnail).isDisplayed();
	}
	
	/**
	 * Validate the content of the block in Our Star Wars Stories section
	 * @return true / false
	 */
	public Boolean presenceOfOurStarWarsStoriesTextDetails() {
		return findOne(ourStarWarStoryDetailsHeader).isDisplayed() &&
				findOne(ourStarWarStoryDetailsText).getText().
				contains(expectedOurStarWarStoryDetailsText);
	}
}
