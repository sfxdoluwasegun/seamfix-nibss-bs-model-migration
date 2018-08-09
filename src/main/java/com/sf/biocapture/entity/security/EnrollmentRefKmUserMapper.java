package com.sf.biocapture.entity.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.sf.biocapture.entity.EnrollmentRef;

import lombok.Getter;
import lombok.Setter;
import nw.orm.core.IEntity;

@Getter
@Setter
@Entity
@Table(name = "ENROLLMENT_REF_USER_MAPPER"
, uniqueConstraints = @UniqueConstraint(
		name = "UNIQUE_ENROLLMENT_REF_USER_MAPPER"
		, columnNames = {"ENROLLMENT_REF_FK", "KM_USER_FK"})
		)
public class EnrollmentRefKmUserMapper extends IEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4103901414872943031L;

	/**
	 * boolean indicating it is the last logged in device
	 */
	@Column(name = "LAST_LOGGED_IN", nullable = false)
	private boolean lastLoggedIn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ENROLLMENT_REF_FK", nullable = false)
	private EnrollmentRef enrollmentRef;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "KM_USER_FK", nullable = false)
	KMUser kmUser;

}
