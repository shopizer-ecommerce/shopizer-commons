package modules.commons.search;

import modules.commons.search.configuration.SearchConfiguration;
import modules.commons.search.request.IndexItem;

/**
 * Search implementation must implement this interface
 * @author carlsamson
 *
 */
public interface SearchModule {
	
	void configure(SearchConfiguration configuration) throws Exception;
	void index(IndexItem item) throws Exception;
	public String getUniqueCode(); 
}
