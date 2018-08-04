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
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Clement
 */
@Entity
@Table(name="SUBSCRIBER_SEARCH_HISTORY")
public class SubscriberSearchHistory extends IEntity {
    
    private static final long serialVersionUID = 371112892765982526L;
    
    @Column(name = "ACTIVITY", nullable = false)
    private String activity;
   
    @GenericGenerator(name="uuid", strategy = "uuid")
    @Column(name = "TRANSACTION_ID",  nullable = false)
    private String transactionId;
    @Column(name = "SUBSCRIBER_SEARCH_PARAMS_FK", nullable = true)
    private Long subscriberSearchParamsFk;
    @Column(name = "PARAMETER_VALUE", nullable = true)
    private String parameterValue;
    @Column(name = "KMUSER_FK", nullable = false)
    private Long kmUserFk;
    @Column(name = "EMAIL_ADDRESS", nullable = false)
    private String emailAddress;
    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;
    @Column(name = "MOBILE", nullable = true)
    private String telephoneNumber;
    @Column(name = "UNIQUE_ID", nullable = true)
    private String uniqueId;
    @Column(name = "MSISDN", nullable = true)
    private String viewedMsisdn;
    @Column(name = "SIM_SERIAL", nullable = true)
    private String viewedSimSerial;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Long getSubscriberSearchParamsFk() {
        return subscriberSearchParamsFk;
    }

    public void setSubscriberSearchParamsFk(Long subscriberSearchParamsFk) {
        this.subscriberSearchParamsFk = subscriberSearchParamsFk;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    public Long getKmUserFk() {
        return kmUserFk;
    }

    public void setKmUserFk(Long kmUserFk) {
        this.kmUserFk = kmUserFk;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getViewedMsisdn() {
        return viewedMsisdn;
    }

    public void setViewedMsisdn(String viewedMsisdn) {
        this.viewedMsisdn = viewedMsisdn;
    }

    public String getViewedSimSerial() {
        return viewedSimSerial;
    }

    public void setViewedSimSerial(String viewedSimSerial) {
        this.viewedSimSerial = viewedSimSerial;
    }
    
    
           
}
