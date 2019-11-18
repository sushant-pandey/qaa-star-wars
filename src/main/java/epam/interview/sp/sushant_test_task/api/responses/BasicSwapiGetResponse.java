package epam.interview.sp.sushant_test_task.api.responses;

import java.util.List;

public class BasicSwapiGetResponse {
	
	private String count;	
	private String next;
	private String previous;
	private List<PlanetDetails> results;
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public List<PlanetDetails> getResults() {
		return results;
	}
	public void setResults(List<PlanetDetails> results) {
		this.results = results;
	}

}
