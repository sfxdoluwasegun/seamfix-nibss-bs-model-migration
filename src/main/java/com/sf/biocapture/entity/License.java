package com.sf.biocapture.entity;
// Generated Jun 10, 2014 6:17:53 PM by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.base.BaseEntity;
import com.sf.biocapture.entity.security.KMUser;

@Audited
@Entity
@Table(name = "LICENSE")
public class License extends BaseEntity {

	private static final long serialVersionUID = -7002576423595369367L;
	
	@Column(name = "MAC_ADDRESS", nullable = false, length = 32)
	private String macAddress;
	
	@Column(name = "RECEIPT_TIMESTAMP", nullable = false)
	private Timestamp receiptTimestamp;
	
	@Column(name = "UPLOAD_TIMESTAMP", nullable = true)
	private Timestamp uploadTimestamp;
	
	@Column(name = "LAST_UPDATED")
	private Timestamp lastUpdated;
	
	@Column(name = "UPDATE_DESCRIPTION", length = 512)
	private String updateDescription;
	
	@Lob
	@Column(name = "FINGER_LICENSE")
	private String fingerLicense;
	
	@Lob
	@Column(name = "FACE_LICENSE")
	private String faceLicense;
	
	@Lob
	@Column(name = "WSQ_LICENSE")
	private String wsqLicense;
	
	@Lob
	@Column(name = "APPLICATION_LICENSE")
	private String applicationLicense;
	
	@Lob
	@Column(name = "MISC_LICENSE1")
	private String miscLicense1;
	
	@Lob
	@Column(name = "MISC_LICENSE2")
	private String miscLicense2;
	
	@Column(name = "REQUEST_STATUS")
	private String requestStatus;
	
	@Column(name = "REVOKED")
	private Boolean revoked;
	
	@Column(name = "KIT_APPROVED", nullable = true) 
	private Boolean approved;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "APPROVED_BY", nullable = true)
	private KMUser approvedBy;
	
	@Column(name = "DISAPPROVAL_DESCRIPTION", nullable = true)
	private String description;

	public License() {
		
	}

	public License(String macAddress, Timestamp receiptTimestamp) {
		this.macAddress = macAddress;
		this.receiptTimestamp = receiptTimestamp;
	}
	public License(String macAddress,
			Timestamp receiptTimestamp, Timestamp lastUpdated,
			String updateDescription, String fingerLicense, String faceLicense,
			String wsqLicense, String applicationLicense, String miscLicense1,
			String miscLicense2, String requestStatus) {
		this.macAddress = macAddress;
		this.receiptTimestamp = receiptTimestamp;
		this.lastUpdated = lastUpdated;
		this.updateDescription = updateDescription;
		this.fingerLicense = fingerLicense;
		this.faceLicense = faceLicense;
		this.wsqLicense = wsqLicense;
		this.applicationLicense = applicationLicense;
		this.miscLicense1 = miscLicense1;
		this.miscLicense2 = miscLicense2;
		this.requestStatus = requestStatus;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public Serializable getReceiptTimestamp() {
		return this.receiptTimestamp;
	}

	public void setReceiptTimestamp(Timestamp receiptTimestamp) {
		this.receiptTimestamp = receiptTimestamp;
	}
	public Serializable getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getUpdateDescription() {
		return this.updateDescription;
	}

	public void setUpdateDescription(String updateDescription) {
		this.updateDescription = updateDescription;
	}
	public String getFingerLicense() {
		return this.fingerLicense;
	}

	public void setFingerLicense(String fingerLicense) {
		this.fingerLicense = fingerLicense;
	}
	public String getFaceLicense() {
		return this.faceLicense;
	}

	public void setFaceLicense(String faceLicense) {
		this.faceLicense = faceLicense;
	}
	public String getWsqLicense() {
		return this.wsqLicense;
	}

	public void setWsqLicense(String wsqLicense) {
		this.wsqLicense = wsqLicense;
	}
	public String getApplicationLicense() {
		return this.applicationLicense;
	}

	public void setApplicationLicense(String applicationLicense) {
		this.applicationLicense = applicationLicense;
	}
	public String getMiscLicense1() {
		return this.miscLicense1;
	}

	public void setMiscLicense1(String miscLicense1) {
		this.miscLicense1 = miscLicense1;
	}
	public String getMiscLicense2() {
		return this.miscLicense2;
	}

	public void setMiscLicense2(String miscLicense2) {
		this.miscLicense2 = miscLicense2;
	}
	public String getRequestStatus() {
		return this.requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public KMUser getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(KMUser approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getUploadTimestamp() {
		return uploadTimestamp;
	}

	public void setUploadTimestamp(Timestamp uploadTimestamp) {
		this.uploadTimestamp = uploadTimestamp;
	}

	public Boolean getRevoked() {
		return revoked;
	}

	public void setRevoked(Boolean revoked) {
		this.revoked = revoked;
	}

}
