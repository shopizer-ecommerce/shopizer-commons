package modules.commons.search.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchConfiguration {

	private List<String> languages = new ArrayList<String>();
	private String clusterName;
	
	
	private List<SearchHost> hosts = new ArrayList<SearchHost>();
	
	private Credentials credentials = null;
	
	/**
	 * name:text
	 * description:text
	 * ...
	 */
	private Map<String,String> productMappings = new HashMap<String,String>();
	private Map<String,String> keywordsMappings = new HashMap<String,String>();
	private Map<String,String> settings = new HashMap<String,String>();
	
	

	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public Map<String, String> getSettings() {
		return settings;
	}
	public void setSettings(Map<String, String> settings) {
		this.settings = settings;
	}
	public List<SearchHost> getHosts() {
		return hosts;
	}
	public void setHosts(List<SearchHost> hosts) {
		this.hosts = hosts;
	}
	public Map<String,String> getProductMappings() {
		return productMappings;
	}
	public void setProductMappings(Map<String,String> productMappings) {
		this.productMappings = productMappings;
	}
	public Map<String,String> getKeywordsMappings() {
		return keywordsMappings;
	}
	public void setKeywordsMappings(Map<String,String> keywordsMappings) {
		this.keywordsMappings = keywordsMappings;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

}
