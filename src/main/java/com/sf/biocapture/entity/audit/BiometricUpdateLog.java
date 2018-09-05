package com.sf.biocapture.entity.audit;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import nw.orm.core.IEntity;

@Getter
@Setter
@Entity
@Table(name = "BIOMETRIC_UPDATE_LOG")
public class BiometricUpdateLog extends IEntity  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2667857449038500981L;

	@Column(name = "UNIQUE_ID", nullable = false)
	private String uniqueId;
	
	@Column(name = "MSISDN", nullable = false)
	private String msisdn;
	
	@Column(name = "KIT_TAG")
	private String kitTag;
	
	@Column(name = "AGL_PLATINUM_CODE")
	private String agkPlatinumCode;
	
	@Column(name = "AGL_MNP_CODE")
	private String aglMnpCode;
	
	@Column(name = "AGL_POSTPAID_CODE")
	private String aglPostpaidCode;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUEST_TIME")
	private Date requestTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RESPONSE_TIME")
	private Date responseTime;

}
