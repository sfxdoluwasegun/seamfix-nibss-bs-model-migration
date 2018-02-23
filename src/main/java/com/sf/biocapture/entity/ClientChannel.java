
package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.sf.biocapture.entity.enums.ClientChannelTypeEnum;

import nw.orm.core.IEntity;


/**
 *
 * @author Mo
 */
@Entity
@Table(name = "CLIENT_CHANNEL")
public class ClientChannel extends IEntity{
    
	private static final long serialVersionUID = 1L;
	
	@Column(name="name",nullable = false, unique = true)
    private String name;
    
	@Column(name="description",nullable = false)
    private String description;

	@Column(name="token",nullable = false)
	private String token;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "client_channel_type_enum", nullable = true) 
    private ClientChannelTypeEnum clientChannelTypeEnum;
    
    public ClientChannel() {       
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public ClientChannelTypeEnum getClientChannelTypeEnum() {
		return clientChannelTypeEnum;
	}

	public void setClientChannelTypeEnum(ClientChannelTypeEnum clientChannelTypeEnum) {
		this.clientChannelTypeEnum = clientChannelTypeEnum;
	}
    
}

