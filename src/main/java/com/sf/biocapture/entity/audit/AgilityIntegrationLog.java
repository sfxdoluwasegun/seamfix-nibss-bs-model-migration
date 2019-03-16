package com.sf.biocapture.entity.audit;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import nw.orm.core.IEntity;

@Entity
@Table(name = "AGILITY_INTEGRATION_LOG_")
public class AgilityIntegrationLog extends IEntity {

    private static final long serialVersionUID = -6499612972924898129L;

    @Column(name = "MSISDN")
    private String msisdn;

    @Column(name = "SIM_SERIAL")
    private String simSerial;

    @Column(name = "RESPONSE_CODE")
    private String responseCode;

    @Column(name = "RESPONSE_DESCRIPTION")
    private String responseDescription;

    @Column(name = "REQUEST_TYPE")
    private String requestType;

    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name = "BACKUP_PATH")
    private String backupPath;
    
    @Column(name = "REQUEST_TIME")
    @Temporal(TemporalType.TIMESTAMP) 
    private Date requestTime;

    @Column(name = "RESPONSE_TIME")
    @Temporal(TemporalType.TIMESTAMP) 
    private Date responseTime;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getSimSerial() {
        return simSerial;
    }

    public void setSimSerial(String simSerial) {
        this.simSerial = simSerial;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}

}
