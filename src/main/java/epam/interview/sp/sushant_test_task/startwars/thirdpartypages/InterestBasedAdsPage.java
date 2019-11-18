package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class InterestBasedAdsPage extends Browser{
	
	private String URL = "http://preferences-mgr.truste.com/?type=starwars&affiliateId=115";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
}
