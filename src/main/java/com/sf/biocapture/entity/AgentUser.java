package com.sf.biocapture.entity;

import javax.persistence.Column;
import com.sf.biocapture.entity.security.KMUser;

public class AgentUser extends KMUser {

	private static final long serialVersionUID = 5941913526756197845L;
	
	/**
	 * flag to determine if agents have been successfully onboarded
	 */
	@Column(name = "ONBOARDED_", nullable = true)
	private Boolean onboarded = false;
	
	public AgentUser(){
		super();
	}

	public Boolean getOnboarded() {
		return onboarded;
	}

	public void setOnboarded(Boolean onboarded) {
		this.onboarded = onboarded;
	}

}
