/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.audit;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import nw.orm.core.IEntity;

/**
 *
 * @author Marcel created on Jun 28, 2016, 1:47:03 PM
 */
@Entity
@Table(name = "CLIENT_ACTIVITY_LOG")
public class ClientActivityLog extends IEntity {

	private static final long serialVersionUID = 7496626320926969760L;
	
	@Column(name = "MAC_ADDRESS")
    private String macAddress;
    @Column(name = "KIT_TAG")
    private String kitTag;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "ACTIVITY")
    private String activity;
    @Column(name = "AFFECTED_RECORD")
    private String affectedRecord;
    @Column(name = "ENROLLMENT_REF")
    private String enrollmentRef;
    @Column(name = "DATE_LOGGED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLogged;
    //enrollmentRef + client current time at creation time
    @Column(name = "ACTIVATION_CODE")
    private String activationCode;
    @Column(name = "SYNCHED")
    private Boolean synched;

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getKitTag() {
        return kitTag;
    }

    public void setKitTag(String kitTag) {
        this.kitTag = kitTag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getAffectedRecord() {
        return affectedRecord;
    }

    public void setAffectedRecord(String affectedRecord) {
        this.affectedRecord = affectedRecord;
    }

    public String getEnrollmentRef() {
        return enrollmentRef;
    }

    public void setEnrollmentRef(String enrollmentRef) {
        this.enrollmentRef = enrollmentRef;
    }

    public Date getDateLogged() {
        return dateLogged;
    }

    public void setDateLogged(Date dateLogged) {
        this.dateLogged = dateLogged;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Boolean getSynched() {
        return synched;
    }

    public void setSynched(Boolean synched) {
        this.synched = synched;
    }

}
