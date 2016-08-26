package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.security.KMUser;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import nw.orm.core.IEntity;

@Entity
@Audited
@Table(name = "ONBOARDING_STATUS")
public class OnboardingStatus extends IEntity {

	private static final long serialVersionUID = 5941913526756197845L;
	
	/**
	 * flag to determine if agents have been successfully onboarded
	 */
	@Column(name = "ONBOARDED_", nullable = true)
	private Boolean onboarded = false;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "USER_FK", nullable = false)
	private KMUser user;
        
	@ManyToOne(optional = true)//made nullable to avoid constraint errors for existing records. this should rather be enforced in code
	@JoinColumn(name = "0NBOARDED_BY_USER_FK")
        private KMUser onboardedByUser;
        
        @Temporal(TemporalType.TIMESTAMP)
        private Date onboardTimestamp;
	
	public OnboardingStatus(){}

	public Boolean isOnboarded() {
		return onboarded;
	}

	public void setOnboarded(Boolean onboarded) {
		this.onboarded = onboarded;
	}

	public KMUser getUser() {
		return user;
	}

	public void setUser(KMUser user) {
		this.user = user;
	}

        public KMUser getOnboardedByUser() {
            return onboardedByUser;
        }

        /**
         * Made nullable to avoid constraint errors for existing records. this should rather be enforced in code
         * @param onboardedByUser 
         */
        public void setOnboardedByUser(KMUser onboardedByUser) {
            this.onboardedByUser = onboardedByUser;
        }

        public Date getOnboardTimestamp() {
            return onboardTimestamp;
        }

        public void setOnboardTimestamp(Date onboardTimestamp) {
            this.onboardTimestamp = onboardTimestamp;
        }
}