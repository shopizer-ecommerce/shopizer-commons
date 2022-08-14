package modules.commons.search.request;

import java.util.Map;

/**
 * size:s
 * @author carlsamson
 *
 */
public class IndexItemVariant {
	
	Map<String, String> variant;
	public IndexItemVariant (Map<String, String> variant) {
		this.variant = variant;
	}
	public Map<String, String> getVariant() {
		return variant;
	}
	public void setVariant(Map<String, String> variant) {
		this.variant = variant;
	}
	
	


}
