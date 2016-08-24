package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.security.KMUser;

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
	
}