package com.sf.biocapture.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

import com.sf.biocapture.entity.base.BaseEntity;

@Entity
@Table(name = "FAULT")
public class Fault extends BaseEntity {

	private static final long serialVersionUID = -4129075904199768375L;

	@ManyToOne(optional = false)
	@JoinColumn(name = "NODE_FK", nullable = false)
	private Node node;
	
	@Column(name = "FAULT_STATUS", nullable = false)
	private String faultStatus;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	@Column(name = "TICKET_NUMBER")
	private String ticketNumber;
	
	@Column(name = "RESOLUTION_TIMESTAMP")
	private Timestamp resolutionTimestamp;
	
	@Column(name = "RESOLVED_BY")
	private Long resolvedBy;
	
	@Column(name = "RECIEPT_TIME_STAMP", nullable = false)
	private Timestamp recieptTimeStamp;

	
	public Node getNode() {
		return this.node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
	public String getFaultStatus() {
		return this.faultStatus;
	}

	public void setFaultStatus(String faultStatus) {
		this.faultStatus = faultStatus;
	}
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getTicketNumber() {
		return this.ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Timestamp getResolutionTimestamp() {
		return this.resolutionTimestamp;
	}

	public void setResolutionTimestamp(Timestamp resolutionTimestamp) {
		this.resolutionTimestamp = resolutionTimestamp;
	}
	public Long getResolvedBy() {
		return this.resolvedBy;
	}

	public void setResolvedBy(Long resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public Timestamp getRecieptTimeStamp() {
		return this.recieptTimeStamp;
	}

	public void setRecieptTimeStamp(Timestamp recieptTimeStamp) {
		this.recieptTimeStamp = recieptTimeStamp;
	}

}
