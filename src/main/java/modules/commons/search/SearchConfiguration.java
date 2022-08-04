package modules.commons.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchConfiguration {
	
	private List<String> merchants = new ArrayList<String>();
	private List<String> languages = new ArrayList<String>();
	
	
	private List<String> hosts = new ArrayList<String>();
	
	private Credentials credentials = null;
	
	private Map<String,String> mappings = new HashMap<String,String>();
	private Map<String,String> settings = new HashMap<String,String>();
	
	
	
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
	public List<String> getHosts() {
		return hosts;
	}
	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public Map<String, String> getMappings() {
		return mappings;
	}
	public void setMappings(Map<String, String> mappings) {
		this.mappings = mappings;
	}
	public Map<String, String> getSettings() {
		return settings;
	}
	public void setSettings(Map<String, String> settings) {
		this.settings = settings;
	}

}
