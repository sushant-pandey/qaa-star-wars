package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class CaliforniaPrivacyRightsPage extends Browser{
	
	private String URL = "https://privacy.thewaltdisneycompany.com/en/current-privacy-policy/your-california-privacy-rights/";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
}
