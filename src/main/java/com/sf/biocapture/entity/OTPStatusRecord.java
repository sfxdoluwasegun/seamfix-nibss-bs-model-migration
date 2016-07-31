
package com.sf.biocapture.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import nw.orm.core.IEntity;
import org.hibernate.envers.Audited;


/**
 *
 * @author wizzyclems
 */
@Audited
@Entity
@Table(name = "OTP_STATUS_RECORD")
public class OTPStatusRecord extends IEntity
{
    
	private static final long serialVersionUID = 6628617560724577981L;
	
	@Column(name="otp",nullable = false)
    private String otp;
    @Column(name="msisdn",nullable = false)
    private String msisdn;
    @Column(name="expiration_time")
    private Timestamp expirationTime;
    @Column(name="otp_used")
    private boolean otpUsed = false;
    @Column(name="time_generated")
    private Timestamp timeGenerated;
    @Column(name="time_used")
    private Timestamp timeUsed;
    
    public OTPStatusRecord() {       
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Timestamp getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Timestamp expirationTime) {
        this.expirationTime = expirationTime;
    }

    public boolean isOtpUsed() {
        return otpUsed;
    }

    public void setOtpUsed(boolean otpUsed) {
        this.otpUsed = otpUsed;
    }

    public Timestamp getTimeGenerated() {
        return timeGenerated;
    }

    public void setTimeGenerated(Timestamp timeGenerated) {
        this.timeGenerated = timeGenerated;
    }

    public Timestamp getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Timestamp timeUsed) {
        this.timeUsed = timeUsed;
    }
      
    
}

