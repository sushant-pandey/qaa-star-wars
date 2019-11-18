package epam.interview.sp.sushant_test_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Function;

public class Browser {
	protected static final Logger LOG = LoggerFactory.getLogger(Browser.class);

	public static final int DEFAULT_ELEMENT_TIMEOUT = 15;
	
	private static final String DEFAULT_BROWSER = "chrome";
	private static final String DEFAULT_APP_URL = "https://www.starwars.com/";
	
	private static WebDriver driver = null;
	
	/**
	 * Browser constructor to invoke default web browser.
	 */
	public Browser() {
		createWebDriver(DEFAULT_BROWSER);
	}
	
	/**
	 * Browser constructor to invoke the browser as set by the test script
	 * @param browserName
	 */
	public Browser(String browserName) {
		createWebDriver(browserName);
	}
	
	/**
	 * Browser constructor to create webdriver. 
	 * Invoke the browser and open the application URL as specified by test script
	 * @param browserName
	 * @param appUrl
	 */
	public Browser(String browserName, String appUrl) {
		createWebDriver(browserName);
		openUrl(appUrl);
	}

	/**
	 * Browser constructor to set the WebDriver
	 * @param driver
	 */
	public Browser(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Create the WebDriver instance based on the browser type name provided by script.
	 * Current implementation supports only chrome driver
	 * @param browserName
	 * @return
	 */
	private WebDriver createWebDriver(String browserName) {
		if(driver == null) {
			if (browserName.toLowerCase().contains("firefox")) {
				// Code for registering firefox driver is here
			}

			// Currently works with a Selenium Server instance
			else if (browserName.toLowerCase().contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resources\\browserdrivers\\chromedriver.exe");
				
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setBrowserName("chrome");

				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("start-maximized");
				driver = new ChromeDriver(options);
			}
			// Looks for IE 32-bit driver local to the Selenium Server
			else if (browserName.equalsIgnoreCase("iexplore") || browserName.equalsIgnoreCase("iexplore32")) {
				// Code for registering ie 32 driver is here
			}
			// Looks for IE 64-bit driver local to the Selenium Server
			else if (browserName.equalsIgnoreCase("iexplore64")) {
				// Code for registering ie 64 driver is here
			}
			

			else if (browserName.equalsIgnoreCase("safari")) {
				// Code for registering safari driver is here
			}
			
			return driver;
		}
		return driver;
	}
	
	/**
	 * Method to retrive the webdriver instance created by program
	 * @return
	 */
	public WebDriver getWebDriver() {
		return this.driver;
	}
	
	/**
	 * Method to open the URL
	 * @param appUrl
	 */
	public void openUrl(String appUrl) {
		driver.get(appUrl);		
	}

	/**
	 * Method to close and quit the browser
	 */
	public static void close() {
		driver.close();
		driver.quit();
		driver = null;
	}
	
	/**
	 * Refresh the browser instance opened
	 */
	public void refreshBrowser() {
		driver.navigate().refresh();
	}
	
	/**
	 * Get the java script executor. Useful to execute javascript using selenium webdriver
	 * @return
	 */
	protected JavascriptExecutor getJavascriptExecutor() {
        return (JavascriptExecutor) driver;
    }
	
	/**
	 * Wait for page to load completely
	 * @return
	 */
	public boolean waitForJQueryInactive() {
        boolean jQcondition = false;
        try {
            Wait<WebDriver> wait = new WebDriverWait(getWebDriver(), 30, 5000);
            wait.until(new Function<WebDriver, Boolean>() {

                public Boolean apply(WebDriver driver) {
                    return (Boolean) getJavascriptExecutor().executeScript("return jQuery.active == 0");
                }
            });
            jQcondition = (Boolean) getJavascriptExecutor()
                            .executeScript("return window.jQuery != undefined && jQuery.active === 0");
            return jQcondition;
        }
        catch (JavascriptException e) {
        	LOG.debug(e.getMessage());
        }
        return jQcondition;
    }
	
	/**
	 * Find the first instance of the element based on the By locator
	 * @param locator
	 * @return
	 */
	protected WebElement findOne(By locator){
		waitForVisibilityOfElement(locator);
		return driver.findElement(locator);
	}
	
	/**
	 * Find all the instance of the element based on the By locator
	 * @param locator
	 * @return
	 */
	protected List<WebElement> findAll(By locator){
		waitForVisibilityOfElement(locator);
		return driver.findElements(locator);
	}
	
	/**
	 * Wait for the execution till the element is visible
	 * @param locator
	 * @return
	 */
	protected WebElement waitForVisibilityOfElement(By locator) {
		Wait<WebDriver> wait = new WebDriverWait(getWebDriver(), 30).
				pollingEvery(Duration.ofSeconds(1)).
				ignoring(NoSuchElementException.class)
				.ignoring(ElementClickInterceptedException.class);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * Wait for the execution till the element is clickable
	 * @param locator
	 * @return
	 */
	protected WebElement waitForClickabilityOfElement(By locator) {
		Wait<WebDriver> wait = new WebDriverWait(getWebDriver(), 30).
				pollingEvery(Duration.ofSeconds(1)).
				ignoring(NoSuchElementException.class)
				.ignoring(ElementNotInteractableException.class)
				.ignoring(ElementClickInterceptedException.class);
				
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	/**
	 * Click on the element identified by the By locator
	 * @param byLocator
	 */
	protected void clickOn(By byLocator){
		waitForVisibilityOfElement(byLocator);
		waitForClickabilityOfElement(byLocator);
		try {
			findOne(byLocator).click();
		} catch(Exception unforseenException) {
			pauseForSeconds(10);
			findOne(byLocator).click();
		}
	}
	
	/**
	 * Hard pause the execution for the specified count of seconds
	 * @param seconds
	 */
	public void pauseForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Switch the window/tab
	 */
	public void switchWindow() {        
        for (String handle : getWebDriver().getWindowHandles()) {
            getWebDriver().switchTo().window(handle);
            LOG.debug("window handle: " + handle);
            LOG.debug("title: " + getWebDriver().getTitle());
        }
        waitForJQueryInactive();
    }
	
	/**
	 * Obtain the URL of the current page
	 * @return
	 */
	public static String getURL() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * Close the currently open window
	 */
	public static void closeCurrentWindow() {
		driver.close();
	}
	
	/**
	 * Scroll down to the bottom of the page using javascript
	 */
	public void scrollDownToBottomOfPage() {
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	/**
	 * Click on the element identified by the By locator using the javascript
	 * @param byLocator
	 */
	public void jsClick(By byLocator) {
		waitForVisibilityOfElement(byLocator);
		waitForClickabilityOfElement(byLocator);
        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click();", getWebDriver().findElement(byLocator));
    }
	
	/**
	 * Switch to the iFrame
	 * @param byLocator
	 */
	public void switchToIframe(By byLocator) {
		Wait<WebDriver> wait = new WebDriverWait(getWebDriver(), 30).
				pollingEvery(Duration.ofSeconds(1)).
				ignoring(NoSuchElementException.class)
				.ignoring(NoSuchFrameException.class);
				
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(byLocator));
	}
	
	/**
	 * Switch to the default frame
	 */
	public void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
	}

}
