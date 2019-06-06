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

    @Column(name = "NIBSS_BVN_VALIDATION_RESP_CODE")
    private String nibssBvnValidationRespCode;

    @Column(name = "NIBSS_BVN_VALIDATION_RESP_MESSAGE")
    private String nibssBvnValidationRespMessage;

    @Column(name = "NIBSS_BVN_VALIDATION_RESP_BODY")
    private String nibssBvnValidationRespBody;

    @Column(name = "NIBSS_BVN_VALIDATION_STATUS")
    private String nibssBvnValidationStatus;

    @Column(name = "VERIFICATION_COUNT")
    private Integer verificationCount;
    
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

    public String getNibssBvnValidationRespCode() {
        return nibssBvnValidationRespCode;
    }

    public void setNibssBvnValidationRespCode(String nibssBvnValidationRespCode) {
        this.nibssBvnValidationRespCode = nibssBvnValidationRespCode;
    }

    public String getNibssBvnValidationRespMessage() {
        return nibssBvnValidationRespMessage;
    }

    public void setNibssBvnValidationRespMessage(String nibssBvnValidationRespMessage) {
        this.nibssBvnValidationRespMessage = nibssBvnValidationRespMessage;
    }

    public String getNibssBvnValidationRespBody() {
        return nibssBvnValidationRespBody;
    }

    public void setNibssBvnValidationRespBody(String nibssBvnValidationRespBody) {
        this.nibssBvnValidationRespBody = nibssBvnValidationRespBody;
    }

    public String getNibssBvnValidationStatus() {
        return nibssBvnValidationStatus;
    }

    public void setNibssBvnValidationStatus(String nibssBvnValidationStatus) {
        this.nibssBvnValidationStatus = nibssBvnValidationStatus;
    }

    public Integer getVerificationCount() {
        return verificationCount;
    }

    public void setVerificationCount(Integer verificationCount) {
        this.verificationCount = verificationCount;
    }
    
    public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

}
