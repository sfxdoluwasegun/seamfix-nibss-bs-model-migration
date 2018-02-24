package com.sf.biocapture.entity.enums;

public enum HeartbeatSourceEnum {

    BIO_SMART("BIO-SMART"),
    GEO_TRACKER("GIO-TRACKER");

    private String name;

    HeartbeatSourceEnum(String name) {
        this.name = name;
    }


}
