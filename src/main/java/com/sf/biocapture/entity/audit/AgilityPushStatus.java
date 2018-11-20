/*12 Sep 2018
charles
*/
package com.sf.biocapture.entity.audit;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sf.biocapture.entity.base.BaseEntity;

@Entity
@Table(name = "AGILTIY_PUSH_STATUS")
public class AgilityPushStatus extends BaseEntity implements Serializable {
	
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
	
	@Column(name = "CREATE_DATE", nullable = false, insertable = true, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate = new Date();

	@Column(name = "LAST_MODIFIED", nullable = true, insertable = true, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModified;
	
	@Column(name = "RESPONSE_TIME", nullable = true, insertable = true, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date responseTime;
	
	@Column(name = "BASIC_DATA_FK", nullable = false)
	private Long basicDatafk;
	
	@Column(name = "MSISDN", nullable = false)
	private String msisdn;

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
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastModified() {
		return lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
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
	@PrePersist
	protected void onCreate() {
		
		this.createDate = new Timestamp(new Date().getTime());
		this.lastModified = this.createDate;
	}

	@PreUpdate
	protected void onUpdate() {
		this.lastModified = new Timestamp(new Date().getTime());
	}

}
