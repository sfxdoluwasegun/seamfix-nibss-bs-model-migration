/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.audit;

import com.sf.biocapture.entity.enums.GeoFenceQuotaRequestTypeEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import nw.orm.core.IEntity;

/**
 *
 * @author Marcel
 * @since Oct 30, 2017 - 4:46:12 PM
 */
@Entity
@Table(name = "GEO_FENCE_QUOTA_LOG")
public class GeoFenceQuotaLog extends IEntity {

    @Column(name = "REQUEST_COUNT")
    private Integer requestCount;
    @Enumerated(EnumType.STRING)
    @Column(name = "REQUEST_TYPE_ENUM")
    private GeoFenceQuotaRequestTypeEnum requestTypeEnum;
    @Column(name = "QUOTA_KEY")
    private String quotaKey;

    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    public GeoFenceQuotaRequestTypeEnum getRequestTypeEnum() {
        return requestTypeEnum;
    }

    public void setRequestTypeEnum(GeoFenceQuotaRequestTypeEnum requestTypeEnum) {
        this.requestTypeEnum = requestTypeEnum;
    }

    public String getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
    }

}
