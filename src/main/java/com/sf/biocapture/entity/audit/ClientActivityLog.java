/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.audit;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import nw.orm.core.IEntity;

/**
 *
 * @author Marcel
 * @since Jun 28, 2016, 1:47:03 PM
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

    public String getEnrollmentRef() {
        return enrollmentRef;
    }

    public void setEnrollmentRef(String enrollmentRef) {
        this.enrollmentRef = enrollmentRef;
    }

    public String getUniqueActivityCode() {
        return uniqueActivityCode;
    }

    public void setUniqueActivityCode(String uniqueActivityCode) {
        this.uniqueActivityCode = uniqueActivityCode;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getRefDeviceId() {
        return refDeviceId;
    }

    public void setRefDeviceId(String refDeviceId) {
        this.refDeviceId = refDeviceId;
    }

    public String getRealTimeDeviceId() {
        return realTimeDeviceId;
    }

    public void setRealTimeDeviceId(String realTimeDeviceId) {
        this.realTimeDeviceId = realTimeDeviceId;
    }

	public Float getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(Float appVersion) {
		this.appVersion = appVersion;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public Integer getFailureCount() {
		return failureCount;
	}

	public String getSyncFileStatus() {
		return syncFileStatus;
	}

	public String getSyncTransferMode() {
		return syncTransferMode;
	}

	public String getNetworkStrength() {
		return networkStrength;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public void setFailureCount(Integer failureCount) {
		this.failureCount = failureCount;
	}

	public void setSyncFileStatus(String syncFileStatus) {
		this.syncFileStatus = syncFileStatus;
	}

	public void setSyncTransferMode(String syncTransferMode) {
		this.syncTransferMode = syncTransferMode;
	}

	public void setNetworkStrength(String networkStrength) {
		this.networkStrength = networkStrength;
	}

	public String getSyncFileName() {
		return syncFileName;
	}

	public void setSyncFileName(String syncFileName) {
		this.syncFileName = syncFileName;
	}

        public String getNetworkType() {
            return networkType;
        }

        public void setNetworkType(String networkType) {
            this.networkType = networkType;
        }
        
        

}
