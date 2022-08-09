package modules.commons.search;

import java.util.List;

import modules.commons.search.configuration.SearchConfiguration;
import modules.commons.search.request.IndexItem;
import modules.commons.search.request.SearchRequest;
import modules.commons.search.request.SearchResponse;

/**
 * Search implementation must implement this interface
 * @author carlsamson
 *
 */
public interface SearchModule {
	
	void configure(SearchConfiguration configuration) throws Exception;
	void index(IndexItem item) throws Exception;
	void index(List<IndexItem> item) throws Exception;
	
	void delete(List<String> languages, Long id) throws Exception;
	
	String getUniqueCode();
	
	SearchResponse searchKeyword(SearchRequest searchRequest) throws Exception;
}
