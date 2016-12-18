package com.sf.biocapture.entity.onboarding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sf.biocapture.entity.enums.FingersEnum;
import com.sf.biocapture.entity.security.KMUser;

import nw.orm.core.IEntity;

/**
 * 
 * @author Nnanna
 *
 */
@Entity
@Table(name = "AGENT_FINGERPRINT")
public class AgentFingerprint extends IEntity {

	private static final long serialVersionUID = 4622548364699511283L;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "USER_FK", nullable = false)
	private KMUser user;
	
	@Lob
	@Column(name = "FINGERPRINT_", nullable = false)
	private byte[] fingerprint;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "FINGER_TYPE", nullable = false)
	private FingersEnum fingerType;

	public KMUser getUser() {
		return user;
	}

	public void setUser(KMUser user) {
		this.user = user;
	}

	public byte[] getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(byte[] fingerprint) {
		this.fingerprint = fingerprint;
	}

	public FingersEnum getFingerType() {
		return fingerType;
	}

	public void setFingerType(FingersEnum fingerType) {
		this.fingerType = fingerType;
	}
}