/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.audit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import nw.orm.core.IEntity;

/**
 *
 * @author Clement
 */
@Entity
@Table(name = "SUBSCRIBER_SEARCH_PARAMS")
public class SubscriberSearchParams  extends IEntity{
    
    private static final long serialVersionUID = 371112892765503526L;
    
    @Column(name = "TRANSACTION_ID", nullable = false)
    private Long transactionId;

    @Column(name = "NAME", nullable = false)
    private String name;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
