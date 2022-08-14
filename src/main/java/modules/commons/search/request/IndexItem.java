package modules.commons.search.request;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Fileds to be insterted
 * @author carlsamson
 *
 */
public class IndexItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String store;
	private String language;
	
	private String name;
	private String description;
	private String brand;
	private String category;
	private List<Map<String,String>> variants; //[{size:S,color:white},{...}] //flattern
	//List
		//variant Map<key,value> -> size:small
	    //variant Map<key,value> -> color:white
	//List
	private Map<String, String> attributes; //flattern
	//maximumLength:300
	//minimumLength:50
	private String price;
	private Long id;
	
	private String reviews;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public List<Map<String,String>> getVariants() {
		return variants;
	}

	public void setVariants(List<Map<String,String>> variants) {
		this.variants = variants;
	}
	

}
