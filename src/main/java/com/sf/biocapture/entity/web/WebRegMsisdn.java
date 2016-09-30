package com.sf.biocapture.entity.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import nw.orm.core.IEntity;
/**
 * @author Nnanna
 * @since September 30, 2016
 */
@Entity
@Table(name = "WEB_REG_MSISDN")
public class WebRegMsisdn extends IEntity {
	private static final long serialVersionUID = 67726702292519865L;
	@Column(name = "SIM_SERIAL")
	private String msisdnSerial;
	@Column(name = "MSISDN")
	private String msisdn;
	@ManyToOne(optional = false)
	@JoinColumn(name = "WEB_REG_FK", nullable = false)
	private WebRegDemographics regBasicData;
	
	public String getMsisdnSerial() {
		return msisdnSerial;
	}
	public void setMsisdnSerial(String msisdnSerial) {
		this.msisdnSerial = msisdnSerial;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public WebRegDemographics getRegBasicData() {
		return regBasicData;
	}
	public void setRegBasicData(WebRegDemographics regBasicData) {
		this.regBasicData = regBasicData;
	}
}
