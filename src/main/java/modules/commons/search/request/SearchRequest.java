package modules.commons.search.request;

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
	
	private String store;
	private String language;
	
	private String searchString;
	
	
	private List<SearchFilter> filters;
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public List<SearchFilter> getFilters() {
		return filters;
	}
	public void setFilters(List<SearchFilter> filters) {
		this.filters = filters;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	


}
