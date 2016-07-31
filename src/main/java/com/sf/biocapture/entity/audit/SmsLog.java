package com.sf.biocapture.entity.audit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.sf.biocapture.entity.enums.SmsStatus;

import nw.orm.core.IEntity;

/**
 * 
 * @author Nnanna
 * 
 */
@Entity
@Table(name = "SMS_LOG")
public class SmsLog extends IEntity {
	
	private static final long serialVersionUID = 3589280471463642098L;
	
	@Column(name = "MSISDN", nullable = false)
	private String msisdn;
	
	@Column(name = "MESSAGE", nullable = false)
	private String message;
	
	@Column(name = "NO_OF_ATTEMPTS")
	private Integer noOfAttempts = 1;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS_", nullable = false)
	private SmsStatus status;
	
	@Column(name = "OPERATION", nullable = false)
	private String operation;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(Integer noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	public SmsStatus getStatus() {
		return status;
	}

	public void setStatus(SmsStatus status) {
		this.status = status;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}