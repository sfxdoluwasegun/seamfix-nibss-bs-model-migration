package com.sf.biocapture.entity.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import nw.orm.core.IEntity;

@Entity
@Table(name = "WATCH_LIST")
public class WatchList extends IEntity{

	/**
	 *
	 */
	private static final long serialVersionUID = 5541767564190737451L;

	@Column(name = "IP_", nullable = false)
	private String remoteAddress;

	@Column(name = "URL_", nullable = false)
	private String targetUrl;

	@Column(name = "BODY_", nullable = true)
	private String requestBody;

	public String getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

}
