/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import nw.orm.core.IEntity;
import nw.orm.core.NwormEntity;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;

/**
 *
 * @author Jaohar
 */
@Audited
@Entity
@Table(name = "BROADCAST_HISTORY")
@AuditOverride(forClass = NwormEntity.class)
public class KycBroadcastHistory extends IEntity{
    private static final long serialVersionUID = 1890113808939179800L;
    
    @Column(name = "NOTIFICATION_TYPE", nullable = false)
    private String notificationType;
    
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "NOTIFICATION_FK", nullable = false)
    private KycBroadcast notification;

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public KycBroadcast getNotification() {
        return notification;
    }

    public void setNotification(KycBroadcast notification) {
        this.notification = notification;
    }
    
    
}
