package epam.interview.sp.sushant_test_task.startwars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import epam.interview.sp.sushant_test_task.Browser;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.AdditionalContentInformationPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.CaliforniaPrivacyRightsPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.ChildrenPrivacyPolicyPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.FacebookPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.HelpDeskPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.InstagramPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.InterestBasedAdsPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.KidsDisneyPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.PrivacyPolicyPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.ShopDisneyPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.TermsOfUsePage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.TumblerPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.TwitterPage;
import epam.interview.sp.sushant_test_task.startwars.thirdpartypages.YouTubePage;

public class Footer extends Browser{
	private By footer_facebookIcon = By.xpath("//footer/descendant::span[@class='facebook-icon']");
	private By footer_instagramIcon = By.xpath("//footer/descendant::span[@class='instagram-icon']");
	private By footer_tumblerIcon = By.xpath("//footer/descendant::span[@class='tumblr-icon']");
	private By footer_twitterIcon = By.xpath("//footer/descendant::span[@class='twitter-icon']");
	private By footer_youtubeIcon = By.xpath("//footer/descendant::span[@class='youtube-icon']");
	private By footer_kidsIcon = By.xpath("//footer/descendant::span[@class='sw-kids-icon']");
	private By footer_trademark = By.xpath("//footer/descendant::p[text()='TM & © Lucasfilm Ltd. All Rights Reserved']");
	private By footer_termsOfUse = By.xpath("//footer/descendant::a[text()='Terms of Use']");
	private By footer_additionContentLink = By.xpath("//footer/descendant::a[text()='Additional Content Information']");
	private By footer_privacyPolicy = By.xpath("//footer/descendant::a[text()='Privacy Policy']");
	private By footer_childrenOnlinePrivacyPolicy = By.xpath("//footer/descendant::a[text()='Children’s Online Privacy Policy']");
	private By footer_californiaPrivacyRights = By.xpath("//footer/descendant::a[text()='Your California Privacy Rights']");
	private By footer_shopDisney = By.xpath("//footer/descendant::a[text()='Star Wars at shopDisney']");
	private By footer_helpdesk = By.xpath("//footer/descendant::a[text()='Star Wars Helpdesk']");
	private By footer_internetBasedAds = By.xpath("//footer/descendant::a[text()='Interest-Based Ads']");
	
	public Footer () {
		scrollDownToBottomOfPage();
	}
		
	/**
	 * Validate the presence of facebook icon in the footer section
	 * @return true/false
	 */
	public Boolean isFacebookIconVisible() {
    	return findOne(footer_facebookIcon).isDisplayed();
    }
	
	/**
	 * Click facebook icon in footer section
	 * @return new instance of the FacebookPage
	 */
	public FacebookPage clickFacebookIcon() {		
    	clickOn(footer_facebookIcon);
    	switchWindow();
    	return new FacebookPage();
    }
    
	/**
	 * Validate the presence of Instagram icon in the footer section
	 * @return true/false
	 */
    public Boolean isInstagramIconVisible() {
    	return findOne(footer_instagramIcon).isDisplayed();
    }
    
    /**
	 * Click Instagram icon in footer section
	 * @return new instance of the InstagramPage
	 */
    public InstagramPage clickInstagramIcon() {
    	clickOn(footer_instagramIcon);
    	switchWindow();
    	return new InstagramPage();
    }
    
    /**
	 * Validate the presence of Tumbler icon in the footer section
	 * @return true/false
	 */
    public Boolean isTumblerIconVisible() {
    	return findOne(footer_tumblerIcon).isDisplayed();
    }
    
    /**
	 * Click Tumbler icon in footer section
	 * @return new instance of the TumblerPage
	 */
    public TumblerPage clickTumblerIcon() {
    	clickOn(footer_tumblerIcon);
    	switchWindow();
    	return new TumblerPage();
    }
    
    /**
	 * Validate the presence of Twitter icon in the footer section
	 * @return true/false
	 */
    public Boolean isTwitterIconVisible() {
    	return findOne(footer_twitterIcon).isDisplayed();
    }
    
    /**
	 * Click Twitter icon in footer section
	 * @return new instance of the TwitterPage
	 */
    public TwitterPage clickTwitterIcon() {
    	clickOn(footer_twitterIcon);
    	switchWindow();
    	return new TwitterPage();
    }
    
    /**
	 * Validate the presence of YouTube icon in the footer section
	 * @return true/false
	 */
    public Boolean isYoutubeIconVisible() {
    	return findOne(footer_youtubeIcon).isDisplayed();
    }
    
    /**
	 * Click YouTube icon in footer section
	 * @return new instance of the YouTubePage
	 */
    public YouTubePage clickYoutubeIcon() {
    	clickOn(footer_youtubeIcon);
    	switchWindow();
    	return new YouTubePage();
    }
    
    /**
	 * Validate the presence of Kids icon in the footer section
	 * @return true/false
	 */
    public Boolean isKidsIconVisible() {
    	return findOne(footer_kidsIcon).isDisplayed();
    }
    
    /**
	 * Click Kids icon in footer section
	 * @return new instance of the KidsDisneyPage
	 */
    public KidsDisneyPage clickKidsIcon() {
    	clickOn(footer_kidsIcon);
    	switchWindow();
    	return new KidsDisneyPage();
    }
    
    /**
	 * Validate the presence of Trademark Statement in the footer section
	 * @return true/false
	 */
    public Boolean isTradeMarkStatementVisible() {
    	return findOne(footer_trademark).isDisplayed();
    }
    
    /**
	 * Validate the presence of Terms of Use link in the footer section
	 * @return true/false
	 */
    public Boolean isTermsOfUseLinkVisible() {
    	return findOne(footer_termsOfUse).isDisplayed();
    }
    
    /**
	 * Click Terms Of Use icon in footer section
	 * @return new instance of the TermsOfUsePage
	 */
    public TermsOfUsePage clickTermsOfUseLink() {
    	//clickOn(footer_termsOfUse);
    	jsClick(footer_termsOfUse);
    	switchWindow();
    	return new TermsOfUsePage();
    }
    
    /**
	 * Validate the presence of Additional Content Link in the footer section
	 * @return true/false
	 */
    public Boolean isAdditionalContentLinkVisible() {
    	return findOne(footer_additionContentLink).isDisplayed();
    }
    
    /**
	 * Click Additional Content Information icon in footer section
	 * @return new instance of the AdditionalContentInformationPage
	 */
    public AdditionalContentInformationPage clickAdditionalContentInformationLink() {
    	//clickOn(footer_additionContentLink);
    	jsClick(footer_additionContentLink);
    	switchWindow();
    	return new AdditionalContentInformationPage();
    }
    
    /**
	 * Validate the presence of Privacy Policy Link in the footer section
	 * @return true/false
	 */
    public Boolean isPrivacyPolicyLinkVisible() {
    	return findOne(footer_privacyPolicy).isDisplayed();
    }
    
    /**
	 * Click Privacy Policy Link in footer section
	 * @return new instance of the PrivacyPolicyPage
	 */
    public PrivacyPolicyPage clickPrivacyPolicyLink() {
    	//clickOn(footer_privacyPolicy);
    	jsClick(footer_privacyPolicy);
    	switchWindow();
    	return new PrivacyPolicyPage();
    }
    
    /**
	 * Validate the presence of Children Online Privacy Plicy Link in the footer section
	 * @return true/false
	 */
    public Boolean isChildrenOnlinePrivacyPolicyLinkVisible() {
    	return findOne(footer_childrenOnlinePrivacyPolicy).isDisplayed();
    }
    
    /**
	 * Click Children Online Privacy Policy link in footer section
	 * @return new instance of the ChildrenPrivacyPolicyPage
	 */
    public ChildrenPrivacyPolicyPage clickChildrenOnlinePrivacyPolicyLink() {
    	//clickOn(footer_childrenOnlinePrivacyPolicy);
    	jsClick(footer_childrenOnlinePrivacyPolicy);
    	switchWindow();
    	return new ChildrenPrivacyPolicyPage();
    }
    
    /**
	 * Validate the presence of California Privacy Rights link in the footer section
	 * @return true/false
	 */
    public Boolean isCaliforniaPrivacyRightsLinkVisible() {
    	return findOne(footer_californiaPrivacyRights).isDisplayed();
    }
    
    /**
	 * Click California Privacy Rights link in footer section
	 * @return new instance of the CaliforniaPrivacyRightsPage
	 */
    public CaliforniaPrivacyRightsPage clickCaliforniaPrivacyRightsLink() {
    	//clickOn(footer_californiaPrivacyRights);
    	jsClick(footer_californiaPrivacyRights);
    	switchWindow();
    	return new CaliforniaPrivacyRightsPage();
    }
    
    /**
	 * Validate the presence of Star wars at shop disney link in the footer section
	 * @return true/false
	 */
    public Boolean isStarWarsAtShopDisneyLinkVisible() {
    	return findOne(footer_shopDisney).isDisplayed();
    }
    
    /**
	 * Click Shop Disney link in footer section
	 * @return new instance of the ShopDisneyPage
	 */
    public ShopDisneyPage clickShopDisneyLink() {
    	//clickOn(footer_shopDisney);
    	jsClick(footer_shopDisney);
    	switchWindow();
    	return new ShopDisneyPage();
    }
    
    /**
	 * Validate the presence of Star wars help desk in the footer section
	 * @return true/false
	 */
    public Boolean isStarWarsHelpDeskLinkVisible() {
    	return findOne(footer_helpdesk).isDisplayed();
    }
    
    /**
	 * Click Help Desk link in footer section
	 * @return new instance of the HelpDeskPage
	 */
    public HelpDeskPage clickStarWarsHelpDeskLink() {
    	//clickOn(footer_helpdesk);
    	jsClick(footer_helpdesk);
    	switchWindow();
    	return new HelpDeskPage();
    }
    
    /**
	 * Validate the presence of Internet based ads link in the footer section
	 * @return true/false
	 */
    public Boolean isInternetBasedAdsLinkVisible() {
    	return findOne(footer_internetBasedAds).isDisplayed();
    }
    
    /**
	 * Click Interest Based Ads link in footer section
	 * @return new instance of the InterestBasedAdsPage
	 */
    public InterestBasedAdsPage clickInternetBasedAdsLink() {
    	//clickOn(footer_internetBasedAds);
    	jsClick(footer_internetBasedAds);
    	switchWindow();
    	return new InterestBasedAdsPage();
    }
}
