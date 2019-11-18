package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class FacebookPage extends Browser{
	
	private String URL = "https://www.facebook.com/StarWars";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
}
