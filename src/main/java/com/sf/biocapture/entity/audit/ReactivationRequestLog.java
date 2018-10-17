/*16 Oct 2018
charles
*/
package com.sf.biocapture.entity.audit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import nw.orm.core.IEntity;

public class ReactivationRequestLog extends IEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7697374486484511718L;

	@Column(name = "MSISDN")
	private String msisdn;
	
	@Column(name = "KIT_TAG")
	private String kitTag;
	
	@Column(name = "DEVICE_ID")
	private String deviceId;
	
	@Column(name = "UNIQUE_ID")
	private String uniqueId;
	
	@Column(name = "AGENT_EMAIL")
	private String agentEmail;
	
	@Column(name = "REQUEST_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date requestTime;
	
	@Column(name = "STATUS")
	private String status;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getKitTag() {
		return kitTag;
	}

	public void setKitTag(String kitTag) {
		this.kitTag = kitTag;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getAgentEmail() {
		return agentEmail;
	}

	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
