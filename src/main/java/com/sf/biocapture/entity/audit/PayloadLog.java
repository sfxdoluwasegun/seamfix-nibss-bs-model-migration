/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.audit;

import com.sf.biocapture.entity.enums.PayloadTypeEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import nw.orm.core.IEntity;

/**
 *
 * @author Marcel
 * @since Jan 17, 2018 - 12:31:07 PM
 */
@Entity
@Table(name = "PAYLOAD_LOG")
public class PayloadLog extends IEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "PAYLOAD_TYPE_ENUM")
    private PayloadTypeEnum payloadTypeEnum;
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "RESPONSE_DESCRIPTION")
    private String responseDescription;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "BACKUP_PATH")
    private String backupPath;

    public PayloadTypeEnum getPayloadTypeEnum() {
        return payloadTypeEnum;
    }

    public void setPayloadTypeEnum(PayloadTypeEnum payloadTypeEnum) {
        this.payloadTypeEnum = payloadTypeEnum;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

}
