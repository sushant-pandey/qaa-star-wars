package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class AdditionalContentInformationPage extends Browser{
	
	private String URL = "https://support.disney.com/hc/en-us";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
}
