package modules.commons.search;


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
