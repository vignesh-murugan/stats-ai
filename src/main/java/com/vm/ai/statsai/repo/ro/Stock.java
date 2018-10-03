/**
 * 
 */
package com.vm.ai.statsai.repo.ro;

import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.data.couchbase.core.mapping.Document;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

/**
 * @author vignesh
 * 
 *         { "name": "Tesla", "stockId": "TSLA", "suggestion": "buy", "updates":
 *         { "news": { "link": "www.something.com", "lst_updated": "2010-09-26
 *         10:00:00" } } }
 *
 */
@Document
public class Stock {

	@Id
	private String id;

	@Field
	@NotNull
	private String name;

	@Field
	@NotNull
	private String stockId;

	@Field
	private Suggestion suggestion;

	@Field
	private List<News> updates;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the stockId
	 */
	public String getStockId() {
		return stockId;
	}

	/**
	 * @param stockId the stockId to set
	 */
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	/**
	 * @return the suggestion
	 */
	public Suggestion getSuggestion() {
		return suggestion;
	}

	/**
	 * @param suggestion the suggestion to set
	 */
	public void setSuggestion(Suggestion suggestion) {
		this.suggestion = suggestion;
	}

	/**
	 * @return the updates
	 */
	public List<News> getUpdates() {
		return updates;
	}

	/**
	 * @param updates the updates to set
	 */
	public void setUpdates(List<News> updates) {
		this.updates = updates;
	}

	

}
