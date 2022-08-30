package modules.commons.search;

import java.util.List;
import java.util.Optional;

import modules.commons.search.configuration.SearchConfiguration;
import modules.commons.search.request.Document;
import modules.commons.search.request.IndexItem;
import modules.commons.search.request.RequestOptions;
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
	
	/**
	 * Index having description (language)
	 * Document id
	 * @param languages
	 * @param id
	 * @throws Exception
	 */
	void delete(List<String> languages, Long id) throws Exception;
	
	/**
	 * Search module code
	 * @return
	 */
	String getUniqueCode();
	
	SearchResponse searchKeywords(SearchRequest searchRequest) throws Exception;
	SearchResponse searchProducts(SearchRequest searchRequest) throws Exception;
	
	
	/**
	 * Get Document for a specific language
	 * @param id
	 * @param language
	 * @return
	 * @throws Exception
	 */
	Optional<Document> getDocument(Long id, String language, RequestOptions option) throws Exception;
	
	/**
	 * Get document id for differet languases
	 * @param id
	 * @param languages
	 * @return
	 * @throws Exception
	 */
	List<Optional<Document>> getDocument(Long id, List<String> languages, RequestOptions option) throws Exception;
	
	Object getConnection();
}
