package com.sf.biocapture.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import nw.orm.core.IEntity;

@Entity
@Table(name = "CHURN_MSISDN")
public class ChurnMsisdn extends IEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1408341226972341277L;
	
	@Column(name = "MSISDN", nullable = false, length = 24, unique = true)
	private String msisdn;
	
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "msisdn")
	private Set<ChurnDetail> churnDetails;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Set<ChurnDetail> getChurnDetails() {
		return churnDetails;
	}
	
	public void addChurnDetail(ChurnDetail churnDetail) {
		if(churnDetails == null){
			churnDetails = new HashSet<ChurnDetail>();
		}
		churnDetail.setMsisdn(this);
		churnDetails.add(churnDetail);
	}

	public void setChurnDetails(Set<ChurnDetail> churnDetails) {
		this.churnDetails = churnDetails;
	}

}
