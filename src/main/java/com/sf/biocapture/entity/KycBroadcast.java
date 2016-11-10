package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.security.KMUser;

import nw.orm.core.IEntity;
import nw.orm.core.NwormEntity;

@Audited
@Entity
@Table(name = "KYC_BROADCAST")
@AuditOverride(forClass = NwormEntity.class)
public class KycBroadcast extends IEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5929760556606380441L;

	@Column(name = "MESSAGE", nullable = false, length = 2048)
	private String message;
	
	@Column(name = "IS_GLOBAL", nullable = false)
	private boolean global;
	
	@Column(name = "IS_EXPIRED", nullable = false)
	private boolean expired;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "NODE_FK", nullable = true)
	private Node targetNode;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "USER_FK", nullable = true)
	private KMUser targetUser;

	public Node getTargetNode() {
		return targetNode;
	}

	public void setTargetNode(Node targetNode) {
		this.targetNode = targetNode;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public boolean isGlobal() {
		return global;
	}

	public void setGlobal(boolean global) {
		this.global = global;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public KMUser getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(KMUser targetUser) {
		this.targetUser = targetUser;
	}

}
