package com.sf.biocapture.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import nw.orm.core.IEntity;

@Getter
@Setter
@ToString
@Entity
@Table(name = "LIVENESS_AUDIT_IMAGE")
public class LivenessAuditImage extends IEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 68269570707922402L;

	@Column(name = "CAPTURE_TIME", updatable = false, nullable = false)
	private Date captureTime;
	
	@Column(name = "UNIQUE_ID", updatable = false, nullable = false)
	private String uniqueId;
	
	@Column(name = "LIVENESS_EVENT", nullable = false)
	private String livenessEvent;
	
	@Lob
	@Column(name = "IMAGE", nullable = false)
	private byte[] image;
	

}
