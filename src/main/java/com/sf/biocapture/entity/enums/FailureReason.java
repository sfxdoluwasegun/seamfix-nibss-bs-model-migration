/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author Uchechukwu Onuoha <yoursuche@gmail.com>
 */
public enum FailureReason {

    APP_NOT_PROVISIONED("User App has not been provisioned"),
    DEVICE_BLACKLISTED("User device is blacklisted"),
    VENDOR_NOT_PROVISIONED("Vendor has not been provisioned"),
    VENDOR_HAS_BEEN_SUSPENDED("Vendor has been suspended"),
    INVALID_VENDOR_PROVISIONING("invalid vendor provisioning"),
    VENDOR_HAS_BEEN_DEACTIVATED("Vendor has been deactivated");

    private FailureReason(String displayName) {
        this.displayName = displayName;
    }

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    public static FailureReason from(String name) {
        for (FailureReason type : values()) {
            if (type.name().equals(name)) {
                return type;
            }
        }
        return null;
    }
}
