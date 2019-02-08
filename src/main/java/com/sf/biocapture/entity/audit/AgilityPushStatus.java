/*12 Sep 2018
charles
*/
package com.sf.biocapture.entity.audit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import nw.orm.core.IEntity;

@Getter
@Setter
@Entity
@Table(name = "AGILITY_PUSH_STATUS")
public class AgilityPushStatus extends IEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7088085077423137410L;
	
	@Column(name = "STATUS", nullable = false)
	private String status;
	
	@Column(name = "RESP_DESC")
	private String responseDescription;
	
	@Column(name = "RESP_CODE")
	private String responseCode;
	
	@Column(name = "RESPONSE_TIME", insertable = true, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date responseTime;
	
	@Column(name = "BASIC_DATA_FK")
	private Long basicDatafk;
	
	@Column(name = "MSISDN")
	private String msisdn;
	
	@Column(name = "SERIAL")
	private String serial;
	
	@Column(name = "ERROR_CATEGORY")
	private String errorCategory;
	
	@Column(name = "ERROR_MESSAGE")
	private String errorMessage;
	
	@Column(name = "SYNC_FILE_NAME")
	private String syncFileName;
	
	@Column(name = "QUARANTINE_REASON")
	private String quarantineReason;
	
	@Column(name = "UNIQUE_ID")
	private String uniqueId;

}
