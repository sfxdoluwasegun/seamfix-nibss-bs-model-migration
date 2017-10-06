/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.audit;

import com.sf.biocapture.entity.enums.LoginStatusEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import nw.orm.core.IEntity;

/**
 *
 * @author Marcel
 * @since Jun 21, 2017 - 5:46:28 PM
 */
@Entity
@Table(name = "ACCESS_LOG")
public class AccessLog extends IEntity {

    @Column(name = "MAC_ADDRESS")
    private String macAddress;
    @Column(name = "KIT_TAG")
    private String kitTag;
    @Column(name = "USERNAME")
    private String username;
    @Enumerated(EnumType.STRING)
    @Column(name = "LOGIN_STATUS_ENUM")
    private LoginStatusEnum loginStatusEnum;
    @Column(name = "REF_DEVICE_ID")
    private String refDeviceId;
    @Column(name = "REALTIME_DEVICE_ID")
    private String realtimeDeviceId;

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

    public LoginStatusEnum getLoginStatusEnum() {
        return loginStatusEnum;
    }

    public void setLoginStatusEnum(LoginStatusEnum loginStatusEnum) {
        this.loginStatusEnum = loginStatusEnum;
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

}
