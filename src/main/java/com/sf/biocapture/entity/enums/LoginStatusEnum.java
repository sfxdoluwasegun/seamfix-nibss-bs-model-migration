/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sf.biocapture.entity.enums;

/**
 *
 * @author Marcel
 * @since Jun 21, 2017 - 5:51:50 PM
 */
public enum LoginStatusEnum {

    SUCCESS("Success"), FAILED_AUTH("Failed Auth"), LOCKED("Locked"), LOCKOUT("Lockout"), IN_ACTIVE_ACCOUNT("In Active Account"), 
    EXPIRED_PASSWORD("Expired Password"), NO_TAG_PRIVILEGE("No Tag Privilege"), BLACKLISTED_KIT("Blacklisted Kit"),
    NO_LOGIN_PRIVILEGE("No Login Privilege"), 
    UNAUTHORIZED_DEVICE_LOGIN("Unauthorized Device Login"),
    ;

    private LoginStatusEnum(String displayName) {
        this.displayName = displayName;
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
