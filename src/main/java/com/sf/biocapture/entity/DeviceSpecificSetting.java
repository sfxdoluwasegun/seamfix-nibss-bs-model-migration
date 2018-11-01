/*30 Oct 2018
charles
*/
package com.sf.biocapture.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.sf.biocapture.entity.base.BaseEntity;


@Entity
@Table(name = "DEVICE_SPECIFIC_SETTING",  uniqueConstraints=
@UniqueConstraint(columnNames={"ENROLLMENT_REF", "SETTING_NAME"}))
public class DeviceSpecificSetting extends BaseEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7414203967232806629L;

	@ManyToOne
	@JoinColumn(name = "ENROLLMENT_REF", nullable = false)
    private EnrollmentRef enrollmentRef;
	
	@Column(name = "SETTING_NAME", nullable = false)
	private String settingName;
	
	@Column(name = "SETTING_VALUE")
	private String settingValue;
	
	@Column(name = "GLOBAL", nullable = true)
	private Boolean global;

	public EnrollmentRef getEnrollmentRef() {
		return enrollmentRef;
	}

	public void setEnrollmentRef(EnrollmentRef enrollmentRef) {
		this.enrollmentRef = enrollmentRef;
	}

	public String getSettingName() {
		return settingName;
	}

	public void setSettingName(String settingName) {
		this.settingName = settingName;
	}

	public String getSettingValue() {
		return settingValue;
	}

	public void setSettingValue(String settingValue) {
		this.settingValue = settingValue;
	}

		public Boolean getGlobal() {
		return global;
	}

	public void setGlobal(Boolean global) {
		this.global = global;
	}
}
