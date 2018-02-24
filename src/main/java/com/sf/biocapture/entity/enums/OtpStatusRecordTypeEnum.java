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

    LOGIN("Login"), 
    EMAIL_VALIDATION("Email Validation"), 
    ONLINE_REGISTRATION("Online Registration"), 
    ONLINE_REGISTRATION_TOKEN("Online Registration Token"),
    SELF_SERVICE_TOKEN(" Service Registration Token"),
    VTU_AGENT_VALIDATION("VTU Agent Validation"),
    FORGOT_PASSWORD("Forgot Password");

    private OtpStatusRecordTypeEnum(String displayName) {
        this.displayName = displayName;
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
