package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import nw.orm.core.IEntity;
/**
 * 
 * @author Nnanna
 *
 */
@Entity
@Table(name = "TAG_HISTORY")
public class TagHistory extends IEntity {
	private static final long serialVersionUID = -6696763946931241054L;

	/**
	 * previous tag - null if it is a retag
	 */
	@Column(name = "OLD_TAG", length = 128)
	private String oldTag;
	
	/**
	 * current tag
	 */
	@Column(name = "NEW_TAG", nullable = false, length = 128)
	private String newTag;
	
	/**
	 * mac address of the machine
	 */
	@Column(name = "MAC_ADDRESS", nullable = false, length = 128)
	private String macAddress;
	
	/**
	 * email address of the support user
	 * tagging the device
	 */
	@Column(name = "ADMIN_EMAIL", length = 128)
	private String adminEmail;

	public String getOldTag() {
		return oldTag;
	}

	public void setOldTag(String oldTag) {
		this.oldTag = oldTag;
	}

	public String getNewTag() {
		return newTag;
	}

	public void setNewTag(String newTag) {
		this.newTag = newTag;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
}