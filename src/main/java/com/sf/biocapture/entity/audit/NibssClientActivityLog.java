package com.sf.biocapture.entity.audit;

import com.sf.biocapture.entity.enums.FailureReason;
import com.sf.biocapture.entity.enums.SyncStatus;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "NIBSS_CLIENT_ACTIVITY_LOG")
public class NibssClientActivityLog extends ClientActivityLog {

    private static final long serialVersionUID = 5739432620905387657L;

    @Column(name = "RECORD_ID")
    private String recordId;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "BVN")
    private String bvn;

    @Column(name = "AGENT_BVN")
    private String agentBvn;

    @Column(name = "AGENT_FIRST_NAME")
    private String agentFirstName;

    @Column(name = "AGENT_LAST_NAME")
    private String agentLastName;

    @Column(name = "APP_NAME")
    private String appName;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Enumerated(EnumType.STRING)
    @Column(name = "SYNC_STATUS")
    private SyncStatus syncStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "NIBSS_FAILURE_REASON")
    private FailureReason nibssFailureReason;

    @Column(name = "COMPLETION_STATUS_FLAG")
    private String completionStatusFlag;

    @Column(name = "BATCH_ID")
    private String batchId;

    @Column(name = "IMPORT_DATE")
    private String importDate;

    @Column(name = "IMPORT_STATUS")
    private String importStatus;

    @Column(name = "HQ_TICKET_ID")
    private String hqTicketId;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "USERNAME")
    private String username;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "ENROLMENT_STATUS")
    private String enrolmentStatus;

    @Column(name = "WORKFLOW_STATUS")
    private String workflowStatus;

    @Column(name = "VERIFICATION_COUNT")
    private Integer verificationCount;

    @Column(name = "VENDOR_ID")
    private String vendorId;

    @Column(name = "SYNC_FILE_CHECK_SUM")
    private String checksum;

    @Column(name = "THRESHOLD_VERSION")
    private Integer thresholdVersion;

    @Column(name = "LOCATION_GEN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date locationGenerationTime;

    @Column(name = "CAPTURED_OFFLINE")
    private Boolean capturedOffline;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getAgentBvn() {
        return agentBvn;
    }

    public void setAgentBvn(String agentBvn) {
        this.agentBvn = agentBvn;
    }

    public String getAgentFirstName() {
        return agentFirstName;
    }

    public void setAgentFirstName(String agentFirstName) {
        this.agentFirstName = agentFirstName;
    }

    public String getAgentLastName() {
        return agentLastName;
    }

    public void setAgentLastName(String agentLastName) {
        this.agentLastName = agentLastName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public SyncStatus getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatus syncStatus) {
        this.syncStatus = syncStatus;
    }

    public FailureReason getNibssFailureReason() {
        return nibssFailureReason;
    }

    public void setNibssFailureReason(FailureReason nibssFailureReason) {
        this.nibssFailureReason = nibssFailureReason;
    }

    public String getCompletionStatusFlag() {
        return completionStatusFlag;
    }

    public void setCompletionStatusFlag(String completionStatusFlag) {
        this.completionStatusFlag = completionStatusFlag;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }

    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public String getHqTicketId() {
        return hqTicketId;
    }

    public void setHqTicketId(String hqTicketId) {
        this.hqTicketId = hqTicketId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEnrolmentStatus() {
        return enrolmentStatus;
    }

    public void setEnrolmentStatus(String enrolmentStatus) {
        this.enrolmentStatus = enrolmentStatus;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public Integer getVerificationCount() {
        return verificationCount;
    }

    public void setVerificationCount(Integer verificationCount) {
        this.verificationCount = verificationCount;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Integer getThresholdVersion() {
        return thresholdVersion;
    }

    public void setThresholdVersion(Integer thresholdVersion) {
        this.thresholdVersion = thresholdVersion;
    }

    public Date getLocationGenerationTime() {
        return locationGenerationTime;
    }

    public void setLocationGenerationTime(Date locationGenerationTime) {
        this.locationGenerationTime = locationGenerationTime;
    }

    public Boolean getCapturedOffline() {
        return capturedOffline;
    }

    public void setCapturedOffline(Boolean capturedOffline) {
        this.capturedOffline = capturedOffline;
    }

}
