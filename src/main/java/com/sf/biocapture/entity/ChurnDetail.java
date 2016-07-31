package com.sf.biocapture.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import nw.orm.core.IEntity;

@Entity
@Table(name = "CHURN_DETAIL")
public class ChurnDetail extends IEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6826957070792293402L;

	@Column(name = "CHURN_DATE", updatable = false, nullable = false)
	private Date churnDate;
	
	@Column(name = "REF_NO", updatable = false, nullable = false)
	private String refNumber;
	
	@ManyToOne(optional = false)
	@JoinColumn(nullable = false, name = "CHURN_MSISDN_FK")
	private ChurnMsisdn msisdn;

	public Date getChurnDate() {
		return churnDate;
	}

	public void setChurnDate(Date churnDate) {
		this.churnDate = churnDate;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public ChurnMsisdn getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(ChurnMsisdn msisdn) {
		this.msisdn = msisdn;
	}

}
