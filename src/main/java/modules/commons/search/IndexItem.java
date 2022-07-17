package modules.commons.search;

import java.io.Serializable;

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
	private String variants; //[{size:S,color:white},{...}] //flattern
	private String attributes; //flattern
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

	public String getVariants() {
		return variants;
	}

	public void setVariants(String variants) {
		this.variants = variants;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
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
	

}
