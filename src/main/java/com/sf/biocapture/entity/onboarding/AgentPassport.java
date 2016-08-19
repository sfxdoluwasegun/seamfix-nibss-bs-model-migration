package com.sf.biocapture.entity.onboarding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sf.biocapture.entity.security.KMUser;

import nw.orm.core.IEntity;

/**
 * 
 * @author Nnanna
 *
 */

@Entity
@Table(name = "AGENT_PASSPORT")
public class AgentPassport extends IEntity {

	private static final long serialVersionUID = 1831352065056636040L;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "USER_FK")
	private KMUser user;
	
	@Lob
	@Column(name = "PASSPORT_DATA", nullable = false)
	private byte[] passportData;

	public KMUser getUser() {
		return user;
	}

	public void setUser(KMUser user) {
		this.user = user;
	}

	public byte[] getPassportData() {
		return passportData;
	}

	public void setPassportData(byte[] passportData) {
		this.passportData = passportData;
	}

}
