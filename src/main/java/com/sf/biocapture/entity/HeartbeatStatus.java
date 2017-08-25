/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import nw.orm.core.IEntity;

/**
 *
 * @author PC
 * @since Aug 25, 2017 - 4:25:20 PM
 */
@Entity
@Table(name = "HEART_BEAT_STATUS")
public class HeartbeatStatus extends IEntity {

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "REF_DEVICE_ID")
    private String refDeviceId;

    @Column(name = "REALTIME_DEVICE_ID")
    private String realtimeDeviceId;

    @Column(name = "NEWORK_STRENGTH")
    private String networkStrength;

    @Column(name = "ROOTED")
    private Boolean rooted;

    @Column(name = "OS_NAME")
    private String osName;

    @Column(name = "OS_VERSION")
    private String osVersion;

    @Column(name = "LOCATION_INFORMATION_SOURCE")
    private String locationInformationSource;

    @Column(name = "PROCESSOR_SPEED")
    private String processorSpeed;

    @Column(name = "USED_STORAGE")
    private String usedStorage;

    @Column(name = "AVAILABLE_STORAGE")
    private String availableStorage;

    @Column(name = "TOTAL_STORAGE")
    private String totalStorage;

    @Column(name = "RAM_SIZE")
    private String ramSize;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getRefDeviceId() {
        return refDeviceId;
    }

    public void setRefDeviceId(String refDeviceId) {
        this.refDeviceId = refDeviceId;
    }

    public String getRealtimeDeviceId() {
        return realtimeDeviceId;
    }

    public void setRealtimeDeviceId(String realtimeDeviceId) {
        this.realtimeDeviceId = realtimeDeviceId;
    }

    public String getNetworkStrength() {
        return networkStrength;
    }

    public void setNetworkStrength(String networkStrength) {
        this.networkStrength = networkStrength;
    }

    public Boolean getRooted() {
        return rooted;
    }

    public void setRooted(Boolean rooted) {
        this.rooted = rooted;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getLocationInformationSource() {
        return locationInformationSource;
    }

    public void setLocationInformationSource(String locationInformationSource) {
        this.locationInformationSource = locationInformationSource;
    }

    public String getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(String processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public String getUsedStorage() {
        return usedStorage;
    }

    public void setUsedStorage(String usedStorage) {
        this.usedStorage = usedStorage;
    }

    public String getAvailableStorage() {
        return availableStorage;
    }

    public void setAvailableStorage(String availableStorage) {
        this.availableStorage = availableStorage;
    }

    public String getTotalStorage() {
        return totalStorage;
    }

    public void setTotalStorage(String totalStorage) {
        this.totalStorage = totalStorage;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

}
