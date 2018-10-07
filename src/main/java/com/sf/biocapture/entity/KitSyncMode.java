/*12 Sep 2018
charles
*/
package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sf.biocapture.entity.base.BaseEntity;

@Entity
@Table(name = "KIT_SYNC_MODE")
public class KitSyncMode extends BaseEntity {

	@Column(name="DEVICE_ID", nullable=false, unique=true)
	private String deviceId;
	@Column(name="SYNC_MODE")
	private String syncMode;
	
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getSyncMode() {
		return syncMode;
	}
	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
	}
	
}
