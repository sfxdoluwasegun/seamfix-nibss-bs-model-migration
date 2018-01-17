/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author Marcel
 * @since Jan 17, 2018 - 12:32:49 PM
 */
public enum PayloadTypeEnum {

    SELF_SERVICE("Self Service");

    private PayloadTypeEnum(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

}
