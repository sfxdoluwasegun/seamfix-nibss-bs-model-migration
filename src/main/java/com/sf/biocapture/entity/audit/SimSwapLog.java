package com.sf.biocapture.entity.audit;

import com.sf.biocapture.entity.EnrollmentRef;
import com.sf.biocapture.bs.entity.enums.CaptureModeEnum;
import com.sf.biocapture.entity.enums.SimSwapStatus;
import nw.orm.core.IEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author Nnanna
 * @since 24/11/2016
 */
@Entity
@Table(name = "SIM_SWAP_LOG")
public class SimSwapLog extends IEntity {
    private static final long serialVersionUID = 1860292452405267656L;

    /**
     * msisdn to be swapped
     */
    @Column(name = "MSISDN", nullable = false)
    private String msisdn;

    /**
     * Sim Serial of the old sim
     */
    @Column(name = "OLD_SIM_SERIAL")
    private String oldSimSerial;

    /**
     * IMSI. optional for now
     */
    @Column(name = "ORDER_NUMBER")
    private String orderNumber;

    /**
     * PUK of the new sim
     */
    @Column(name = "PUK")
    private String puk;

    /**
     * Sim Serial of the new sim
     */
    @Column(name = "NEW_SIM_SERIAL", nullable = false)
    private String simSerial;

    /**
     * kit tag
     */
    @Column(name = "KIT_TAG", nullable = false)
    private String tag;

    /**
     * kit mac address
     */
    @Column(name = "MAC_ADDRESS", nullable = false)
    private String macAddress;

    /**
     * unique ID
     */
    @Column(name = "UNIQUE_ID", nullable = false)
    private String uniqueId;

    /**
     * email address of the agent doing the swap
     */
    @Column(name = "AGENT_EMAIL", nullable = false)
    private String agentEmail;

    /**
     * time the swap was initiated
     */
    @Column(name = "SWAP_TIME", nullable = false)
    private Timestamp swapTime;

    /**
     * time the swap was confirmed
     */
    @Column(name = "CONFIRMATION_TIMESTAMP")
    private Timestamp confirmationTimestamp;

    /**
     * status of the sim swap
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "SWAP_STATUS", nullable = false)
    private SimSwapStatus swapStatus;

    /**
     * portrait of the subscriber who carried out the swap
     */
    @Lob
    @Column(name = "SUBSCRIBER_PASSPORT", nullable = true)
    private byte[] subscriberPassport;

    /**
     * Enrollment Ref
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENROLLMENT_REF_FK", nullable = true)
    private EnrollmentRef enrollmentRef;

    @Column(name = "CAPTURE_MODE")
    private String captureMode;

    /**
     * this is added to capture realtime device id for biosmart on web registration
     */
    @Column(name = "REALTIME_DEVICE_ID")
    private String realtimeDeviceId;

    public SimSwapLog() {
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPuk() {
        return puk;
    }

    public void setPuk(String puk) {
        this.puk = puk;
    }

    public String getSimSerial() {
        return simSerial;
    }

    public void setSimSerial(String simSerial) {
        this.simSerial = simSerial;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public Timestamp getConfirmationTimestamp() {
        return confirmationTimestamp;
    }

    public void setConfirmationTimestamp(Timestamp confirmationTimestamp) {
        this.confirmationTimestamp = confirmationTimestamp;
    }

    public SimSwapStatus getSwapStatus() {
        return swapStatus;
    }

    public void setSwapStatus(SimSwapStatus swapStatus) {
        this.swapStatus = swapStatus;
    }

    public String getOldSimSerial() {
        return oldSimSerial;
    }

    public void setOldSimSerial(String oldSimSerial) {
        this.oldSimSerial = oldSimSerial;
    }

    public Timestamp getSwapTime() {
        return swapTime;
    }

    public void setSwapTime(Timestamp swapTime) {
        this.swapTime = swapTime;
    }

    public byte[] getSubscriberPassport() {
        return subscriberPassport;
    }

    public void setSubscriberPassport(byte[] subscriberPassport) {
        this.subscriberPassport = subscriberPassport;
    }

    public EnrollmentRef getEnrollmentRef() {
        return enrollmentRef;
    }

    public void setRef(EnrollmentRef enrollmentRef) {
        this.enrollmentRef = enrollmentRef;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public CaptureModeEnum getCaptureMode() {
        return this.captureMode == null ? null : CaptureModeEnum.valueOf(this.captureMode);
    }

    public void setCaptureMode(CaptureModeEnum captureModeEnum) {
        this.captureMode = captureModeEnum == null ? null : captureModeEnum.name();
    }

    public String getRealtimeDeviceId() {
        return realtimeDeviceId;
    }

    public void setRealtimeDeviceId(String realtimeDeviceId) {
        this.realtimeDeviceId = realtimeDeviceId;
    }
}
