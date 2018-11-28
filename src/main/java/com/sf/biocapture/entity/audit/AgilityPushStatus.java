/*12 Sep 2018
charles
*/
package com.sf.biocapture.entity.audit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import nw.orm.core.IEntity;

@Entity
@Table(name = "AGILITY_PUSH_STATUS")
public class AgilityPushStatus extends IEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7088085077423137410L;
	
	@Column(name = "STATUS", nullable = false)
	private String status;
	
	@Column(name = "RESP_DESC")
	private String responseDescription;
	
	@Column(name = "RESP_CODE")
	private String responseCode;
	
	@Column(name = "RESPONSE_TIME", nullable = true, insertable = true, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date responseTime;
	
	@Column(name = "BASIC_DATA_FK", nullable = true)
	private Long basicDatafk;
	
	@Column(name = "MSISDN", nullable = false)
	private String msisdn;
	
	@Column(name = "HAS_ERROR", nullable = false)
	private Boolean hasError = false;
	
	@Column(name = "ERROR_MESSAGE", nullable = true)
	private String errorMessage;
	
	@Column(name = "SYNC_FILE_NAME", nullable = true)
	private String syncFileName;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	public Date getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	public Long getBasicDatafk() {
		return basicDatafk;
	}
	public void setBasicDatafk(Long basicDatafk) {
		this.basicDatafk = basicDatafk;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Boolean getHasError() {
		return hasError;
	}
	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSyncFileName() {
		return syncFileName;
	}
	public void setSyncFileName(String syncFileName) {
		this.syncFileName = syncFileName;
	}
}
