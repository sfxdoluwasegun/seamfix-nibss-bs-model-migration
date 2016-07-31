package com.sf.biocapture.entity.audit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import nw.orm.core.IEntity;

@Entity
@Table(name = "AGILITY_INTEGRATION_LOG")
public class AgilityIntegrationLog extends IEntity {

	private static final long serialVersionUID = -6499612972924898129L;
	
	@Column(name = "REQUEST_XML", nullable = true, unique = false, length = 2048)
	private String requestXml;
	
	@Column(name = "RESPONSE_XML", nullable = true, unique = false, length = 2048)
	private String responseXml;
	
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

	public String getRequestXml() {
		return requestXml;
	}

	public void setRequestXml(String requestXml) {
		this.requestXml = requestXml;
	}

	public String getResponseXml() {
		return responseXml;
	}

	public void setResponseXml(String responseXml) {
		this.responseXml = responseXml;
	}

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
	
}
