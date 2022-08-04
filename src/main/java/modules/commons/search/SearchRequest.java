package modules.commons.search;

import java.util.List;

/**
 * @author carlsamson
 * 
 * Search a word / sentence
 * Has filter
 * 		variants
 * 		brands
 * 		price range
 *
 */

public class SearchRequest {
	
	
	private String searchString;
	private List<String> filters;
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public List<String> getFilters() {
		return filters;
	}
	public void setFilters(List<String> filters) {
		this.filters = filters;
	}
	
	
	


}
