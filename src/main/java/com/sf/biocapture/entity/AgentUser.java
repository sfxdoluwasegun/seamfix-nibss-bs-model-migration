package com.sf.biocapture.entity;

import javax.persistence.Column;
import com.sf.biocapture.entity.security.KMUser;

public class AgentUser extends KMUser {

	private static final long serialVersionUID = 5941913526756197845L;
	
	/**
	 * flag to determine if agents have been successfully onboarded
	 */
	@Column(name = "ONBOARDING_STATUS", nullable = true)
	private Boolean onboardingStatus = false;
	
	public AgentUser(){
		super();
	}

	public Boolean getOnboardingStatus() {
		return onboardingStatus;
	}

	public void setOnboardingStatus(Boolean onboardingStatus) {
		this.onboardingStatus = onboardingStatus;
	}


}
