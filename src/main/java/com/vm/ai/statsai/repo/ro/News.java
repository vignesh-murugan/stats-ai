/**
 * 
 */
package com.vm.ai.statsai.repo.ro;

import com.couchbase.client.java.repository.annotation.Field;

/**
 * @author vignesh
 *
 */
public class News {

	@Field
	private String link;

	@Field
	private String date;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
