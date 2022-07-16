package modules.commons.search;

import java.util.ArrayList;
import java.util.List;

public class SearchConfiguration {
	
	private List<String> merchants = new ArrayList<String>();
	private List<String> languages = new ArrayList<String>();
	public List<String> getMerchants() {
		return merchants;
	}
	public void setMerchants(List<String> merchants) {
		this.merchants = merchants;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

}
