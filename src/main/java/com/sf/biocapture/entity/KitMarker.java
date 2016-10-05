/**
 * This entity maintains a list of kits marked for special operations like receiving updates.
 */
package com.sf.biocapture.entity;

import com.sf.biocapture.entity.base.BaseEntity;
import com.sf.biocapture.entity.security.KMUser;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author wizzyclems
 */
// TODO is this class useful to clients in the field
@Entity
@Table(name = "KIT_MARKER")
public class KitMarker extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8041407323124897862L;
	@Column(name = "TAG_ID")
	String tagId;
	@Column(name = "MAC_ADDRESS")
	String macAddress;
	@Column(name = "DATE_ADDED")
	Timestamp dateAdded;
	@ManyToOne(optional = true)
	@JoinColumn(name = "KM_USER_FK", nullable = true)
	KMUser addedBy;

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

}
