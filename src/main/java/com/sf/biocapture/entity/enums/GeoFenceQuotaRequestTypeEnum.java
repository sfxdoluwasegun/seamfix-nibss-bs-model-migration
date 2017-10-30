/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author Marcel
 * @since Oct 30, 2017 - 4:48:52 PM
 */
public enum GeoFenceQuotaRequestTypeEnum {

    GOOGLE("Google"), OPEN_STREET("Open Street");

    private GeoFenceQuotaRequestTypeEnum(String description) {
        this.description = description;
    }
    private String description;

    public String getDescription() {
        return description;
    }
}
