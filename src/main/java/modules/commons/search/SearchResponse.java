package modules.commons.search;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse {
	

	private int count;
	private int page;
	private int start;
	private List<SearchItem> items = new ArrayList<SearchItem>();
	private List<Aggregation> aggregations = new ArrayList<Aggregation>();
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public List<SearchItem> getItems() {
		return items;
	}
	public void setItems(List<SearchItem> items) {
		this.items = items;
	}
	public List<Aggregation> getAggregations() {
		return aggregations;
	}
	public void setAggregations(List<Aggregation> aggregations) {
		this.aggregations = aggregations;
	}

}
