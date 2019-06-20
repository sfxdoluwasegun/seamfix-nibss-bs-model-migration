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
public enum SyncStatus {

    SYNC_PENDING_CONFIRMATION("Sync pending confirmation"),
    SYNC_CONFIRMED("Sync confirmed"),
    SYNC_FAILED_VALIDATION("sync failed validation");

    private SyncStatus(String displayName) {
        this.displayName = displayName;
    }

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    public static SyncStatus from(String name) {
        for (SyncStatus type : values()) {
            if (type.name().equals(name)) {
                return type;
            }
        }
        return null;
    }
}
