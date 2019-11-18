package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class TermsOfUsePage extends Browser{
	
	private String URL = "https://disneytermsofuse.com/";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
}
