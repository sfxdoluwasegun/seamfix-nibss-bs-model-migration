package com.sf.biocapture.entity.audit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NIBSS_CLIENT_ACTIVITY_LOG")
public class NibssClientActivityLog extends ClientActivityLog {
	
	@Column(name = "RECORD_ID")
	private String recordId;
	
	@Column(name = "BVN")
	private String bvn;
	
	@Column(name = "AGENT_FIRST_NAME")
	private String agentFirstName;
	
	@Column(name = "AGENT_LAST_NAME")
	private String agentLastName;
	
	@Column(name = "APP_NAME")
	private String appName;
	
	@Column(name = "LATITUDE")
	private String latitude;
	
	@Column(name = "LONGITUDE")
	private String longitude;
	
	@Column(name = "SYNC_STATUS")
	private String syncStatus;
	
	@Column(name = "VENDOR_ID")
	private String vendorId;

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getBvn() {
		return bvn;
	}

	public void setBvn(String bvn) {
		this.bvn = bvn;
	}

	public String getAgentFirstName() {
		return agentFirstName;
	}

	public void setAgentFirstName(String agentFirstName) {
		this.agentFirstName = agentFirstName;
	}

	public String getAgentLastName() {
		return agentLastName;
	}

	public void setAgentLastName(String agentLastName) {
		this.agentLastName = agentLastName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	
	
	
	
	

}
