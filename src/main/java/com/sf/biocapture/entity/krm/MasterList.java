package com.sf.biocapture.entity.krm;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MASTERLIST")
public class MasterList {
	
	@Id
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "TAG")
	private String tag;
	
	@Column(name = "MAC_ADDRESS")
	private String macAddress;
	
	@Column(name = "DEALER")
	private String dealer;
	
	@Column(name = "FSA")
	private String fsa;
	
	@Column(name = "DISTRICT_MANAGER")
	private String districtManager;
	
	@Column(name = "ZONE")
	private String zone;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "VENDOR_TYPE")
	private String vendorType;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "DEPLOYMENT_CATEGORY")
	private String deploymentCategory;
	
	@Column(name = "CLIENT_TYPE")
	private String clientType;
	
	@Column(name = "TAG_TYPE")
	private String kitType;
	
	@Column(name = "MACHINE_SERIAL")
	private String machineSerialNumber;
	
	@Column(name = "PURCHASE_YEAR")
	private Integer yearOfPurchase;
	
	@Column(name = "NUMBER_OF_AGENTS")
	private Integer noOfAgents;
	
	@Column(name = "ACTIVE")
	private boolean active;
	
	@Column(name = "MACHINE_MODEL")
	private String machineModel;
	
	@Column(name = "LAST_SYNC_TIME")
	private String lastSyncTime;
	
	@Column(name = "DEAL_CODE")
	private String dealCode;
	
	@Column(name = "REGION")
	private String region;
        
        @Column(name = "KIT_APP_VERSION", nullable = true)
	private Float lastInstalledUpdate;
        
        @Column(name = "WHITELIST_STATUS", nullable = true)
	private Boolean whitelistStatus;

	public String getMachineSerialNumber() {
		return machineSerialNumber;
	}

	public void setMachineSerialNumber(String machineSerialNumber) {
		this.machineSerialNumber = machineSerialNumber;
	}

	public Integer getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(Integer yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getDealer() {
		return dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getDistrictManager() {
		return districtManager;
	}

	public void setDistrictManager(String districtManager) {
		this.districtManager = districtManager;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeploymentCategory() {
		return deploymentCategory;
	}

	public void setDeploymentCategory(String deploymentCategory) {
		this.deploymentCategory = deploymentCategory;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getMachineModel() {
		return machineModel;
	}

	public void setMachineModel(String machineModel) {
		this.machineModel = machineModel;
	}

	public String getLastSyncTime() {
		return lastSyncTime;
	}

	public void setLastSyncTime(String lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}

	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getKitType() {
		return kitType;
	}

	public void setKitType(String kitType) {
		this.kitType = kitType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNoOfAgents() {
		return noOfAgents;
	}

	public void setNoOfAgents(Integer noOfAgents) {
		this.noOfAgents = noOfAgents;
	}

    public Float getLastInstalledUpdate() {
        return lastInstalledUpdate;
    }

    public void setLastInstalledUpdate(Float lastInstalledUpdate) {
        this.lastInstalledUpdate = lastInstalledUpdate;
    }

    public Boolean getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(Boolean whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }


        
}
