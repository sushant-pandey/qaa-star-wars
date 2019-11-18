package epam.interview.sp.sushant_test_task.startwars;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import epam.interview.sp.sushant_test_task.Browser;
import epam.interview.sp.sushant_test_task.startwars.pages.CommunityPage;
import epam.interview.sp.sushant_test_task.startwars.pages.DatabankPage;
import epam.interview.sp.sushant_test_task.startwars.pages.FilmsPage;
import epam.interview.sp.sushant_test_task.startwars.pages.HomePage;
import epam.interview.sp.sushant_test_task.startwars.pages.InteractivePage;
import epam.interview.sp.sushant_test_task.startwars.pages.LoginPopUpPage;
import epam.interview.sp.sushant_test_task.startwars.pages.NewsAndBlogPage;
import epam.interview.sp.sushant_test_task.startwars.pages.SeriesPage;
import epam.interview.sp.sushant_test_task.startwars.pages.SignUpPage;
import epam.interview.sp.sushant_test_task.startwars.pages.VideoPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.FacebookPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.InstagramPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.KidsDisneyPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.TumblerPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.TwitterPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.YouTubePage;


/**
 * @author susha
 *
 */
public abstract class AbstractStartWarsPage extends Browser{
	public static AbstractStartWarsPage CurrentPage;
	
	protected By starWarsLogo = By.xpath("//a[@title='Star Wars Logo']");
	private By facebookIcon = By.className("facebook-icon");
	private By instagramIcon = By.className("instagram-icon");
	private By tumblerIcon = By.className("tumblr-icon");
	private By twitterIcon = By.className("twitter-icon");
	private By youtubeIcon = By.className("youtube-icon");
	private By kidsIcon = By.className("sw-kids-icon");
	protected By searchBox = By.id("nav-search-input");
	protected By searchIcon = By.id("nav-search-icon");
	protected By loginButton = By.xpath("//div[text()='Log In']");
	protected By signUpButton = By.xpath("//div[text()='Sign Up']");
	
	private By newsAndBlogTabLinkLocator = By.xpath("//a[contains(@class, 'news-content')]");
	private By videoTabLinkLocator = By.xpath("//a[@itemprop='url']/p/span[text()='Video']");
	private By filmsTabLinkLocator = By.xpath("//a[@itemprop='url']/p/span[text()='Films']");
	private By seriesTabLinkLocator = By.xpath("//a[@itemprop='url']/p/span[text()='Series']");
	private By interactiveTabLinkLocator = By.xpath("//a[@itemprop='url']/p/span[text()='Interactive']");
	private By databankTabLinkLocator = By.xpath("//a[@itemprop='url']/p/span[text()='Databank']");
	private By communityTabLinkLocator = By.xpath("//a[@itemprop='url']/p/span[text()='Community']");
	
	private By popUpOuterFrame = By.xpath("//iframe[contains(@src, 'https://secure.starwars.com')]");
	
	private By popUpIFrameLocator = By.id("disneyid-iframe");
	
	private By loginTabLocator = By.xpath("//div[text()='Log In']");
	private By signUpTabLocator = By.xpath("//div[text()='Sign Up']");
	
	
	/**
	 * Method to wait for load. 
	 * Every class which is inheriting the Abstract Class must implement it
	 * @return WebElement
	 */
	abstract public WebElement waitForLoad();

    /**
     * Confirm the presence of the webelement on the page. 
     * Every class which is inheriting the Abstract Class must implement it
     * @return
     */
    abstract public Boolean confirm();
    
    
    /**
     * Validate the presence of the facebook icon in the header part of the page
     * @return true/false
     */
    public Boolean isFacebookIconVisible() {
    	return findOne(facebookIcon).isDisplayed();
    }
    
    /**
     * Click on the facebook icon in the header part of the page.
     * @return new instance of the webpage for Facebook
     */
    public FacebookPage clickFacebookIcon() {
    	clickOn(facebookIcon);
    	switchWindow();
    	return new FacebookPage();
    }
    
    /**
     * Validate the presence of the instagram icon in the header part of the page
     * @return true/false
     */
    public Boolean isInstagramIconVisible() {
    	return findOne(instagramIcon).isDisplayed();
    }
    
    /**
     * Click on the Instagram icon in the header part of the page.
     * @return new instance of the webpage for Instagram
     */
    public InstagramPage clickInstagramIcon() {
    	clickOn(instagramIcon);
    	switchWindow();
    	return new InstagramPage();
    }
    
    /**
     * Validate the presence of the Tumbler icon in the header part of the page
     * @return true/false
     */
    public Boolean isTumblerIconVisible() {
    	return findOne(tumblerIcon).isDisplayed();
    }
    
    /**
     * Click on the Tumbler icon in the header part of the page.
     * @return new instance of the webpage for Tumbler
     */
    public TumblerPage clickTumblerIcon() {
    	clickOn(tumblerIcon);
    	switchWindow();
    	return new TumblerPage();
    }
    
    /**
     * Validate the presence of the Twitter icon in the header part of the page
     * @return true/false
     */
    public Boolean isTwitterIconVisible() {
    	return findOne(twitterIcon).isDisplayed();
    }
    
    /**
     * Click on the Twitter icon in the header part of the page.
     * @return new instance of the webpage for Twitter
     */
    public TwitterPage clickTwitterIcon() {
    	clickOn(twitterIcon);
    	switchWindow();
    	return new TwitterPage();
    }
    
    /**
     * Validate the presence of the YouTube icon in the header part of the page
     * @return true/false
     */
    public Boolean isYoutubeIconVisible() {
    	return findOne(youtubeIcon).isDisplayed();
    }
    
    /**
     * Click on the YouTube icon in the header part of the page.
     * @return new instance of the webpage for YouTube
     */
    public YouTubePage clickYoutubeIcon() {
    	clickOn(youtubeIcon);
    	switchWindow();
    	return new YouTubePage();
    }
    
    /**
     * Validate the presence of the Kids icon in the header part of the page
     * @return true/false
     */
    public Boolean isKidsIconVisible() {
    	return findOne(kidsIcon).isDisplayed();
    }
    
    /**
     * Click on the Kids icon in the header part of the page.
     * @return new instance of the webpage for Kids
     */
    public KidsDisneyPage clickKidsIcon() {
    	clickOn(kidsIcon);
    	switchWindow();
    	return new KidsDisneyPage();
    }
    
    /**
     * Validate the presence of the search box on the top of the page
     * @return true/false
     */
	public Boolean isSearchBoxVisible() {
		return findOne(searchBox).isDisplayed() && 
				findOne(searchIcon).isDisplayed();
	}
    	
    /**
     * Get the placeholder attribute of the search box
     * @return
     */
    public String getPlaceHolderValueOfSearchBox() {
    	return findOne(searchBox).getAttribute("placeholder");
    }
    
    /**
     * Validate the presence of the Login button on the top of the page
     * @return true/false
     */
    public Boolean presenceOfLoginButton() {
    	return findOne(loginButton).isDisplayed();
    }
    
    /**
     * Validate the presence of the SignUp button on the top of the page
     * @return true/false
     */
    public Boolean presenceOfSignUpButton() {
    	return findOne(signUpButton).isDisplayed();
    }
    
    /**
     * Get the instance of the footer of the page
     * @return new instance of the Footer class
     */
    public Footer getFooter() {
    	return new Footer();
    }
    
    /**
     * Navigate to the Home Page by clicking Star Wars logo on the top
     * @return new instance of the HomePage class
     */
    public HomePage goToHomePage() {
    	clickOn(starWarsLogo);
    	return (HomePage)changePage(new HomePage());
    }
    
    /**
     * Navigate to the Community Page by clicking Community Tab link
     * @return new instance of the CommunityPage class
     */
    public CommunityPage goToCommunityPage() {
    	clickOn(communityTabLinkLocator);
    	return (CommunityPage)changePage(new CommunityPage());
    }
    
    /**
     * Navigate to the Databank Page by clicking Databank Tab link
     * @return new instance of the DatabankPage class
     */
    public DatabankPage goToDatabankPage() {
    	clickOn(databankTabLinkLocator);
    	return (DatabankPage)changePage(new DatabankPage());
    }
    
    /**
     * Navigate to the Films Page by clicking Films Tab link
     * @return new instance of the FilmsPage class
     */
    public FilmsPage goToFilmsPage() {
    	clickOn(filmsTabLinkLocator);
    	return (FilmsPage)changePage(new FilmsPage());
    }
    
    /**
     * Navigate to the Interactive Page by clicking Interactive Tab link
     * @return new instance of the InteractivePage class
     */
    public InteractivePage goToInteractivePage() {
    	clickOn(interactiveTabLinkLocator);
    	return (InteractivePage)changePage(new InteractivePage());
    }
    
    /**
     * Navigate to the News And Blog Page by clicking News and Blog Tab link
     * @return new instance of the NewsAndBlogPage class
     */
    public NewsAndBlogPage goToNewsAndBlogPage() {
    	clickOn(newsAndBlogTabLinkLocator);
    	return (NewsAndBlogPage)changePage(new NewsAndBlogPage());
    }
    
    /**
     * Navigate to the Series Page by clicking Series Tab link
     * @return new instance of the SeriesPage class
     */
    public SeriesPage goToSeriesPage() {
    	clickOn(seriesTabLinkLocator);
    	return (SeriesPage)changePage(new SeriesPage());
    }
    
    /**
     * Navigate to the Video Page by clicking Video Tab link
     * @return new instance of the VideoPage class
     */
    public VideoPage goToVideoPage() {
    	clickOn(videoTabLinkLocator);
    	return (VideoPage)changePage(new VideoPage());
    }
    
    /**
     * Click the login link on the top of the page
     * @return new instance of the LoginPopUpPage class
     */
    public LoginPopUpPage clickLogInLink() {
    	clickOn(loginTabLocator);
    	pauseForSeconds(10);
    	switchToIframe(popUpOuterFrame);
    	switchToIframe(popUpIFrameLocator);
    	return new LoginPopUpPage();
    }
    
    /**
     * Click the Sign Up link on the top of the page
     * @return new instance of the SignUpPage class
     */
    public SignUpPage clickSignUpLink() {
    	clickOn(signUpTabLocator);
    	pauseForSeconds(10);
    	switchToIframe(popUpOuterFrame);
    	switchToIframe(popUpIFrameLocator);
    	return new SignUpPage();
    }
    
    /**
     * Change the page to the target navigation page.
     * It waits for the page to load and confirm it.
     * @param newPage
     * @return
     */
    public static AbstractStartWarsPage changePage(AbstractStartWarsPage newPage) {
    	AbstractStartWarsPage previousPage = CurrentPage;
        CurrentPage = newPage;
        boolean found = false;
        try {
            /* WebElement telltale = */ CurrentPage.waitForLoad();
            LOG.info("CHANGING PAGE " + CurrentPage.getClass().getName());
            found = true;
        }
        catch (TimeoutException timeout) {
            LOG.error("TIMEOUT waiting for " + CurrentPage.getClass().getName());
            // probably form submit failed validation so leave on current page
            // or maybe wait/confirm Currentpage here ?
        }
        if (!found || !CurrentPage.confirm()) {
            CurrentPage = previousPage;
            LOG.warn("REVERTING to " + CurrentPage.getClass().getName());
        }
        return CurrentPage;
    }
}
