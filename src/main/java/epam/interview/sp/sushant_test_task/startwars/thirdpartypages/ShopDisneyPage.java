package epam.interview.sp.sushant_test_task.startwars.thirdpartypages;

import epam.interview.sp.sushant_test_task.Browser;

public class ShopDisneyPage extends Browser{
	
	private String URL = "https://www.shopdisney.com/uptown-disney/?src=starwars&CMP=OTL-Dcom&att=StarWars_Footer_Store";

	/**
	 * Validate the current URL of the page
	 * @return true/false
	 */
	public Boolean validateUrl() {
		return getURL().contains(URL);
	}
}
