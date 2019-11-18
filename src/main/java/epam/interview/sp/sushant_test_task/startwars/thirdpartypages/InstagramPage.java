package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class InstagramPage extends Browser{
	
	private String URL = "https://www.instagram.com/starwars/";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		LOG.info(getURL());
		return getURL().contains(URL);
	}
}
