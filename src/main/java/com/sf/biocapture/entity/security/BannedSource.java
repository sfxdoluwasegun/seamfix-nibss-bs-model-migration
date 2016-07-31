package com.sf.biocapture.entity.security;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import nw.orm.core.IEntity;

@Entity
@Table(name = "BANNED_")
public class BannedSource extends IEntity{

	/**
	 *
	 */
	private static final long serialVersionUID = 4225884488278716501L;

	@Column(name = "IP_", nullable = false)
	private String remoteAddress;

	@Column(name = "EXPIRY_", nullable = false)
	private Date expiryDate = new Date();

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

}
