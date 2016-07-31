package com.sf.biocapture.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import nw.orm.core.IEntity;

import org.hibernate.envers.Audited;

@Audited
@Entity
@Table(name = "FM_LICENSE_QUOTA")
public class FMLicenseQuota extends IEntity {

	private static final long serialVersionUID = -7707577407740302406L;

	@Column(name = "PURCHASED_LICENCES")
	private Integer purchasedLicences;
	
	@Column(name = "PURCHASE_DATE", nullable = true)
	private Timestamp purchaseDate;
	
	public Integer getPurchasedLicences() {
		return purchasedLicences;
	}

	public void setPurchasedLicences(Integer purchasedLicences) {
		this.purchasedLicences = purchasedLicences;
	}

	public Timestamp getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Timestamp purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
