package epam.interview.sp.sushant_test_task;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static Properties environmentConfig;
	
	static protected String testSuiteName;
	
	protected static String browser = "chrome";
	
	protected static final Logger LOG = LoggerFactory.getLogger(TestBase.class);
	
	protected StringWriter stringWriter;
	protected PrintWriter printWriter;
	
	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		LOG.info("Initiating the TestNG Test Suite");
		environmentConfig = ConfigReader.getEnvironmentConfiguration();
		LOG.info("production environment details \n " + environmentConfig);

		TestBase.browser = System.getProperty("browser");

		stringWriter = new StringWriter();
		printWriter = new PrintWriter(stringWriter);
	}
}
