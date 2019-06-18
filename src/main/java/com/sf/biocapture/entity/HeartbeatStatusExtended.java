/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sf.biocapture.entity.enums.HeartbeatSourceEnum;

import nw.orm.core.IEntity;

/**
 *
 * @author Uche
 * @since Aug 25, 2019 - 4:25:20 PM
 */
@Entity
@Table(name = "HEART_BEAT_STATUS_EXTENDED")
public class HeartbeatStatusExtended extends IEntity {

    @Column(name = "TAG")
    private String tag;

    @Column(name = "AGENT_NAME")
    private String agentName;

    @Column(name = "AGENT_MOBILE")
    private String agentMobile;

    @Column(name = "MAC_ADDRESS")
    private String macAddress;

    @Column(name = "DEPLOY_STATE")
    private String deployState;

    @Column(name = "CAMERA_STATUS")
    private String cameraStatus;

    @Column(name = "SCANNER_STATUS")
    private String scannerStatus;

    @Column(name = "CLIENT_TIME_STATUS")
    private String clientTimeStatus;

    @Column(name = "CLIENT_UPTIME")
    private Long clientUptime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECEIPT_DATE")
    private Date receiptDate;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "REF_DEVICE_ID", unique = true)
    private String refDeviceId;

    @Column(name = "REALTIME_DEVICE_ID")
    private String realtimeDeviceId;

    @Column(name = "NETWORK_STRENGTH")
    private String networkStrength;

    @Column(name = "NETWORK_CONNECTION_TYPE")
    private String networkConnectionType;

    @Column(name = "NETWORK_TYPE")
    private String networkType;

    @Column(name = "ROOTED")
    private Boolean rooted;

    @Column(name = "OS_NAME")
    private String osName;

    @Column(name = "OS_VERSION")
    private String osVersion;

    @Column(name = "LOCATION_INFORMATION_SOURCE")
    private String locationInformationSource;

    @Column(name = "LOCATION_ACCURACY")
    private Double locationAccuracy;

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

    @Column(name = "COORDINATE_ADDRESS")
    private String coordinateAddress;

    @Column(name = "APP_VERSION")
    private String appVersion;

    @Column(name = "MOCKED_COORDINATE")
    private Boolean mockedCoordinate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, name = "HEART_BEAT_SOURCE")
    private HeartbeatSourceEnum heartBeatSource;

    @Column(name = "GEO_TRACKER_APP_VERSION")
    private String geotrackerAppVersion;

    @Column(name = "PHONE_STATUS_ENABLED")
    private Boolean phoneStatusEnabled;

    @Column(name = "LOCATION_PERMISSION_GRANTED")
    private Boolean locationPermissionGranted;

    @Column(name = "VENDOR_APP_ID")
    private String vendorAppId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOCATION_GENERATION_TIME")
    private Date locationGenerationTime;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentMobile() {
        return agentMobile;
    }

    public void setAgentMobile(String agentMobile) {
        this.agentMobile = agentMobile;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getDeployState() {
        return deployState;
    }

    public void setDeployState(String deployState) {
        this.deployState = deployState;
    }

    public String getCameraStatus() {
        return cameraStatus;
    }

    public void setCameraStatus(String cameraStatus) {
        this.cameraStatus = cameraStatus;
    }

    public String getScannerStatus() {
        return scannerStatus;
    }

    public void setScannerStatus(String scannerStatus) {
        this.scannerStatus = scannerStatus;
    }

    public String getClientTimeStatus() {
        return clientTimeStatus;
    }

    public void setClientTimeStatus(String clientTimeStatus) {
        this.clientTimeStatus = clientTimeStatus;
    }

    public Long getClientUptime() {
        return clientUptime;
    }

    public void setClientUptime(Long clientUptime) {
        this.clientUptime = clientUptime;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

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

    public String getNetworkConnectionType() {
        return networkConnectionType;
    }

    public void setNetworkConnectionType(String networkConnectionType) {
        this.networkConnectionType = networkConnectionType;
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

    public Double getLocationAccuracy() {
        return locationAccuracy;
    }

    public void setLocationAccuracy(Double locationAccuracy) {
        this.locationAccuracy = locationAccuracy;
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

    public String getCoordinateAddress() {
        return coordinateAddress;
    }

    public void setCoordinateAddress(String coordinateAddress) {
        this.coordinateAddress = coordinateAddress;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Boolean getMockedCoordinate() {
        return mockedCoordinate;
    }

    public void setMockedCoordinate(Boolean mockedCoordinate) {
        this.mockedCoordinate = mockedCoordinate;
    }

    public HeartbeatSourceEnum getHeartBeatSource() {
        return heartBeatSource;
    }

    public void setHeartBeatSource(HeartbeatSourceEnum heartBeatSource) {
        this.heartBeatSource = heartBeatSource;
    }

    public String getGeotrackerAppVersion() {
        return geotrackerAppVersion;
    }

    public void setGeotrackerAppVersion(String geotrackerAppVersion) {
        this.geotrackerAppVersion = geotrackerAppVersion;
    }

    public Boolean getPhoneStatusEnabled() {
        return phoneStatusEnabled;
    }

    public void setPhoneStatusEnabled(Boolean phoneStatusEnabled) {
        this.phoneStatusEnabled = phoneStatusEnabled;
    }

    public Boolean getLocationPermissionGranted() {
        return locationPermissionGranted;
    }

    public void setLocationPermissionGranted(Boolean locationPermissionGranted) {
        this.locationPermissionGranted = locationPermissionGranted;
    }

    public Date getLocationGenerationTime() {
        return locationGenerationTime;
    }

    public void setLocationGenerationTime(Date locationGenerationTime) {
        this.locationGenerationTime = locationGenerationTime;
    }
}
