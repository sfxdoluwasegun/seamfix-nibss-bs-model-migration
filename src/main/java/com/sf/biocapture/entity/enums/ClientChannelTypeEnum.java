/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author Mo
 */
public enum ClientChannelTypeEnum {

    SELF_SERVICE("Self Service");

    private ClientChannelTypeEnum(String displayName) {
        this.displayName = displayName;
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
