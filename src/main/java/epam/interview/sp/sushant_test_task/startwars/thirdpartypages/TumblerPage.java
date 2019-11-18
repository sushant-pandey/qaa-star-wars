package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class TumblerPage extends Browser{
	
	private String URL = "https://starwars.tumblr.com/";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		LOG.info(getURL());
		return getURL().contains(URL);
	}
}
