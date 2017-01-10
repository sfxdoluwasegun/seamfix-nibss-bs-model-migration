package com.sf.biocapture.entity;

import com.sf.biocapture.entity.enums.FMLicenseRequestTypeEnum;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import nw.orm.core.IEntity;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.security.KMUser;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Finger matching license request entity
 *
 * @author Nnanna
 *
 */
@Audited
@Entity
@Table(name = "FM_LICENSE_REQUEST")
public class FMLicenseRequest extends IEntity {

    private static final long serialVersionUID = -3016989490300638529L;

    @Column(name = "KIT_TAG", nullable = false)
    private String kitTag;

    @Column(name = "MAC_ADDRESS", nullable = false)
    private String macAddress;

    @Column(name = "AGENT_NAME")
    private String agentName;

    @Column(name = "EMAIL_ADDRESS", nullable = false)
    private String emailAddress;

    @Column(name = "COMMENTS", nullable = true)
    private String comments;

    @Column(name = "IS_APPROVED", nullable = true)
    private Boolean approved;

    @Column(name = "REQUEST_DATE", nullable = false)
    private Timestamp requestDate;

    @Column(name = "APPROVAL_DATE", nullable = true)
    private Timestamp approvalDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "REQUESTED_BY", nullable = false)
    private KMUser requestedBy;

    @ManyToOne(optional = true)
    @JoinColumn(name = "APPROVED_BY", nullable = true)
    private KMUser approvedBy;

    @Column(name = "LICENSE_HASH", nullable = true)
    private String licenseHash;

    @Enumerated(EnumType.STRING)
    @Column(name = "LICENSE_REQUEST_TYPE")
    private FMLicenseRequestTypeEnum licenseRequestType = FMLicenseRequestTypeEnum.SINGLE;

    public String getLicenseHash() {
        return licenseHash;
    }

    public void setLicenseHash(String licenseHash) {
        this.licenseHash = licenseHash;
    }

    public String getKitTag() {
        return kitTag;
    }

    public void setKitTag(String kitTag) {
        this.kitTag = kitTag;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public Timestamp getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Timestamp approvalDate) {
        this.approvalDate = approvalDate;
    }

    public KMUser getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(KMUser approvedBy) {
        this.approvedBy = approvedBy;
    }

    public KMUser getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(KMUser requestedBy) {
        this.requestedBy = requestedBy;
    }

    public FMLicenseRequestTypeEnum getLicenseRequestType() {
        return licenseRequestType;
    }

    public void setLicenseRequestType(FMLicenseRequestTypeEnum licenseRequestType) {
        this.licenseRequestType = licenseRequestType;
    }

}
