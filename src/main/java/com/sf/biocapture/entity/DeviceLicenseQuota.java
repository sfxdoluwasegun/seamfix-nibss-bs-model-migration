/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import nw.orm.core.IEntity;
import org.hibernate.envers.Audited;

/**
 *
 * @author SEAMFIX - PC
 */
@Audited
@Entity
@Table(name = "DEVICE_LICENSE_QUOTA")
public class DeviceLicenseQuota extends IEntity {
    
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
