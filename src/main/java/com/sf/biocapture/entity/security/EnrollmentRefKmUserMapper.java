package com.sf.biocapture.entity.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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
	private boolean lastLoggedIn = false;

	/**
	 * boolean indicating it is the last logged in device
	 */
	@Column(name = "DIRECTLY_MAPPED", nullable = false)
	private boolean directlyMapped = false;

	@Column(name = "ENROLLMENT_REF_FK", nullable = false)
	private Long enrollmentRefId;

	@Column(name = "KM_USER_FK", nullable = false)
	private Long kmUserPk;

}
