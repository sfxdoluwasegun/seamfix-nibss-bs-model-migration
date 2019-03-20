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

import com.sf.biocapture.entity.enums.TerminationFlag;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import nw.orm.core.IEntity;

/**
 *
 * @author Marcel
 * @since Jun 28, 2016, 1:47:03 PM
 */
@Getter
@Setter
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
    @Column(name = "UNIQUE_ACTIVITY_CODE")
    private String uniqueActivityCode;
    @Column(name = "ENROLLMENT_REF")
    private String enrollmentRef;
    @Column(name = "ACTIVITY_START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activityStartTime;
    @Column(name = "ACTIVITY_END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activityEndTime;
    @Column(name = "DURATION")
    private Long duration;
    @Column(name = "REF_DEVICE_ID")
    private String refDeviceId;
    @Column(name = "REALTIME_DEVICE_ID")
    private String realTimeDeviceId;
    @Column(name = "APP_VERSION")
    private Float appVersion;
    @Column(name = "FAILURE_REASON")
    private String failureReason;
    @Column(name = "FAILURE_COUNT")
    private Integer failureCount;
    @Column(name = "SYNC_FILE_STATUS")
    private String syncFileStatus;
    @Column(name = "SYNC_TRANSFER_MODE")
    private String syncTransferMode;
    @Column(name = "NETWORK_STRENGTH")
    private String networkStrength;
    @Column(name = "SYNC_FILE_NAME")
    private String syncFileName;
    @Column(name = "NETWORK_TYPE")
    private String networkType;
    @Column(name = "EXTENSION_COUNT")
    private Integer extensionCount;
    @Column(name = "POINT_OF_TERMINATION")
    private String pointOfTermination;
    @Column(name = "TERMINATION_FLAG")
    private String terminationFlag;
    
    public TerminationFlag getTerminationFlag() {

        if (terminationFlag == null) {
            return null;
        }

        return TerminationFlag.from(terminationFlag);
    }
    
    public void setTerminationFlag(TerminationFlag terminationFlag) {
    	this.terminationFlag = terminationFlag == null ? null : terminationFlag.getName();
    }
}
