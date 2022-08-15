package modules.commons.search.request;

public class SearchFilter {
	
	private boolean isVariant;
	
	private String field;
	private String value;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isVariant() {
		return isVariant;
	}
	public void setVariant(boolean isVariant) {
		this.isVariant = isVariant;
	}

}
