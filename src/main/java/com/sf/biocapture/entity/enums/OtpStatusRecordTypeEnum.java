/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author Marcel
 * @since 15-Aug-2016, 13:16:42
 */
public enum OtpStatusRecordTypeEnum {

    LOGIN("Login"), EMAIL_VALIDATION("Email Validation");

    private OtpStatusRecordTypeEnum(String displayName) {
        this.displayName = displayName;
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
