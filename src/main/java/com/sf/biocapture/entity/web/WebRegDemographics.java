package com.sf.biocapture.entity.web;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import nw.orm.core.IEntity;

/**
 * @author Nnanna
 * @since September 30, 2016
 */
@Entity
@Table(name = "WEB_REG_DEMOGRAPHICS")
public class WebRegDemographics extends IEntity {
	private static final long serialVersionUID = 5202508339119257132L;
	//basic data
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "SURNAME")
	private String surname;
	@Column(name = "OTHERNAME")
	private String otherName;
	@Column(name = "BIRTHDAY")
	private Date birthday;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "MOTHERSMAIDENNAME")
	private String mothersMaidenName;
	@Column(name = "STATE_OF_ORIGIN")
	private String stateOfOrigin;
	@Column(name = "LGA_OF_ORIGIN")
	private String lgaOfOrigin;
	@Column(name = "NATIONALITY")
	private String nationality;
	
	//address
	@Column(name = "RESIDENCY_STATUS")
	private String residencyStatus;
	@Column(name = "FLAT_NO")
	private String flatNo;
	@Column(name = "STREET")
	private String street;
	@Column(name = "CITY")
	private String city;
	@Column(name = "AREA_OF_RESIDENCE")
	private String areaOfResidence;
	@Column(name = "RESIDENTIAL_ADD_LGA")
	private String residentialAddressLGA;
	@Column(name = "RESIDENTIAL_ADD_STATE")
	private String residentialAddressState;
	
	//dynamic data
	@Column(name = "OCCUPATION")
	private String occupation;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ALTERNATE_PHONE_NUMBER")
	private String alternatePhoneNumber;
	
	//passport details
	@Column(name = "PASSPORT_NUMBER")
	private String passportNumber;
	@Column(name = "PASSPORT_EXPIRY_DATE")
	private Timestamp expiryDate;
	@Column(name = "ISSUING_COUNTRY_CODE")
	private String issuingCountryCode;

	//registration details
	@Column(name = "REGISTRATION_TYPE")
	private String registrationType;
	@Column(name = "REGISTRATION_TIMESTAMP")
	private Timestamp registrationTimeStamp;
	@Column(name = "REGISTRATION_TOKEN")
	private Timestamp registrationToken;
	@Column(name = "SUBSCRIBER_TYPE")
	private String subscriberType;
	@Column(name = "UNIQUE_ID")
	private String uniqueId;

	//company 
	@Column(name = "COMPANY_NAME")
	private String companyName;
	@Column(name = "COMPANY_FLAT_NO")
	private String companyFlatNo;
	@Column(name = "COMPANY_STREET")
	private String companyStreet;
	@Column(name = "COMPANY_CITY")
	private String companyCity;
	@Column(name = "COMPANY_ADDRESS_POSTAL_CODE")
	private String companyAddressPostalCode;
	@Column(name = "COMPANY_ADDRESS_LGA")
	private String companyAddressLga;
	@Column(name = "COMPANY_ADDRESS_STATE")
	private String companyAddressState;
	@Column(name = "COMPANY_ID")
	private String companyId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getOtherName() {
		return otherName;
	}
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMothersMaidenName() {
		return mothersMaidenName;
	}
	public void setMothersMaidenName(String mothersMaidenName) {
		this.mothersMaidenName = mothersMaidenName;
	}
	public String getStateOfOrigin() {
		return stateOfOrigin;
	}
	public void setStateOfOrigin(String stateOfOrigin) {
		this.stateOfOrigin = stateOfOrigin;
	}
	public String getLgaOfOrigin() {
		return lgaOfOrigin;
	}
	public void setLgaOfOrigin(String lgaOfOrigin) {
		this.lgaOfOrigin = lgaOfOrigin;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getResidencyStatus() {
		return residencyStatus;
	}
	public void setResidencyStatus(String residencyStatus) {
		this.residencyStatus = residencyStatus;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAreaOfResidence() {
		return areaOfResidence;
	}
	public void setAreaOfResidence(String areaOfResidence) {
		this.areaOfResidence = areaOfResidence;
	}
	public String getResidentialAddressLGA() {
		return residentialAddressLGA;
	}
	public void setResidentialAddressLGA(String residentialAddressLGA) {
		this.residentialAddressLGA = residentialAddressLGA;
	}
	public String getResidentialAddressState() {
		return residentialAddressState;
	}
	public void setResidentialAddressState(String residentialAddressState) {
		this.residentialAddressState = residentialAddressState;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAlternatePhoneNumber() {
		return alternatePhoneNumber;
	}
	public void setAlternatePhoneNumber(String alternatePhoneNumber) {
		this.alternatePhoneNumber = alternatePhoneNumber;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public Timestamp getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getIssuingCountryCode() {
		return issuingCountryCode;
	}
	public void setIssuingCountryCode(String issuingCountryCode) {
		this.issuingCountryCode = issuingCountryCode;
	}
	public String getRegistrationType() {
		return registrationType;
	}
	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
	public Timestamp getRegistrationTimeStamp() {
		return registrationTimeStamp;
	}
	public void setRegistrationTimeStamp(Timestamp registrationTimeStamp) {
		this.registrationTimeStamp = registrationTimeStamp;
	}
	public Timestamp getRegistrationToken() {
		return registrationToken;
	}
	public void setRegistrationToken(Timestamp registrationToken) {
		this.registrationToken = registrationToken;
	}
	public String getSubscriberType() {
		return subscriberType;
	}
	public void setSubscriberType(String subscriberType) {
		this.subscriberType = subscriberType;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyFlatNo() {
		return companyFlatNo;
	}
	public void setCompanyFlatNo(String companyFlatNo) {
		this.companyFlatNo = companyFlatNo;
	}
	public String getCompanyStreet() {
		return companyStreet;
	}
	public void setCompanyStreet(String companyStreet) {
		this.companyStreet = companyStreet;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCompanyAddressPostalCode() {
		return companyAddressPostalCode;
	}
	public void setCompanyAddressPostalCode(String companyAddressPostalCode) {
		this.companyAddressPostalCode = companyAddressPostalCode;
	}
	public String getCompanyAddressLga() {
		return companyAddressLga;
	}
	public void setCompanyAddressLga(String companyAddressLga) {
		this.companyAddressLga = companyAddressLga;
	}
	public String getCompanyAddressState() {
		return companyAddressState;
	}
	public void setCompanyAddressState(String companyAddressState) {
		this.companyAddressState = companyAddressState;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
}
