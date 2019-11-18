package epam.interview.sp.sushant_test_task;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	static String configFileLocation;
	
	public static Properties getEnvironmentConfiguration() {
		
		configFileLocation = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\environmentconfig\\envConfig.properties";
		
		Properties environmentConfig = new Properties();
		InputStream input = null;
		System.out.println("Config file location " + configFileLocation);
		try {

			input = new FileInputStream(configFileLocation);

			// load a properties file
			environmentConfig.load(input);
			//InputStream resourceAsStream = (new ConfigReader()).getClass().getClassLoader().getResourceAsStream(configFileLocation);
			System.out.println("environmentConfig " + environmentConfig);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return environmentConfig;
	}

}
