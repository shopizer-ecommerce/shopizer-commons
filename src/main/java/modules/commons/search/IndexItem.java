package modules.commons.search;

import java.io.Serializable;

/**
 * Fileds to be insterted
 * @author carlsamson
 *
 */
public class IndexItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private String brand;
	private String category;
	private String variants; //[{size:S,color:white},{...}] //flattern
	private String attributes; //flattern
	private String price;
	private Long id;
	
	private String reviews;
	

}
