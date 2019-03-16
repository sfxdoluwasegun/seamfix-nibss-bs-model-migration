package com.sf.biocapture.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sf.biocapture.entity.security.KMUser;

import lombok.Getter;
import lombok.Setter;
import nw.orm.core.IEntity;


@Getter
@Setter
@Entity
@Table(name = "CLIENT_LOCK_OUT_LOG")
public class ClientLockOutLog extends IEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2333282062991479314L;

	@ManyToOne(optional = false)
	@JoinColumn(name = "KM_USER_FK", nullable = false)
	private KMUser user;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENROLLMENT_REF_FK", nullable = true)
    private EnrollmentRef enrollmentRef;

}
