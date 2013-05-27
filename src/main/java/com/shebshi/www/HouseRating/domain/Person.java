package com.shebshi.www.HouseRating.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4088515613000498309L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	
	@Column(name = "FIRST_NAME", nullable=false)
	private String firstName;	
	
	@Column(name = "OTHER_NAME", nullable=true)
	private String otherName;
	
	@Column(name = "LAST_NAME", nullable=false)
	private String lastName;	
	
	@Column(name = "ADDRESS", nullable=true)
	private String address;	
	
	@Column(name = "POSTCODE", nullable=true)
	private String postCode;	
	
	@Column(name = "TELEPHONE", nullable=true)
	private int telefone;
	
	@Column(name = "MOBILE_TELEPHONE", nullable=true)
	private int mobilTelephone;
	
	@Column(name = "EMAIL", nullable=true)
	private int email;
	
	@Column(name = "FACEBOOK_URL", nullable=true)
	private String facebookUrl;
	
	@Column(name = "TWITTER_URL", nullable=true)
	private String twitterUrl;
	
	@Column(name = "LINKEDIN_URL", nullable=true)
	private String LinkedInUrl;
	
	@Column(name = "NATIONALITY", nullable=true)
	private String nationality;
	
	@Column(name = "NATIONAL_ID", nullable=true)
	private String national_id;
	
	@Column(name = "SOCIAL_SECURITY", nullable=true)
	private String socialSecurity;
	
	@Column(name = "DATE_OF_BIRTH")
	private String dateOfBirth;
	
	@Column(name = "NEXT_OF_KIN", nullable=true)
	private String nextOfKin;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the mobilTelephone
	 */
	public int getMobilTelephone() {
		return mobilTelephone;
	}
	/**
	 * @param mobilTelephone the mobilTelephone to set
	 */
	public void setMobilTelephone(int mobilTelephone) {
		this.mobilTelephone = mobilTelephone;
	}
	/**
	 * @return the email
	 */
	public int getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(int email) {
		this.email = email;
	}
	/**
	 * @return the facebookUrl
	 */
	public String getFacebookUrl() {
		return facebookUrl;
	}
	/**
	 * @param facebookUrl the facebookUrl to set
	 */
	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}
	/**
	 * @return the twiteerUrl
	 */
	public String getTwitterUrl() {
		return twitterUrl;
	}
	/**
	 * @param twiteerUrl the twiteerUrl to set
	 */
	public void setTwitterUrl(String twiteerUrl) {
		this.twitterUrl = twiteerUrl;
	}
	/**
	 * @return the linkedInUrl
	 */
	public String getLinkedInUrl() {
		return LinkedInUrl;
	}
	/**
	 * @param linkedInUrl the linkedInUrl to set
	 */
	public void setLinkedInUrl(String linkedInUrl) {
		LinkedInUrl = linkedInUrl;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the nationalIdentification
	 */
	public String getNationalIdentification() {
		return national_id;
	}
	/**
	 * @param nationalIdentification the nationalIdentification to set
	 */
	public void setNationalIdentification(String nationalIdentification) {
		this.national_id = nationalIdentification;
	}
	
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the nextOfKin
	 */
	public String getNextOfKin() {
		return nextOfKin;
	}
	/**
	 * @param nextOfKin the nextOfKin to set
	 */
	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}
	
	public String getOtherName() {
		return otherName;
	}
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}
	public String getNational_id() {
		return national_id;
	}
	public void setNational_id(String national_id) {
		this.national_id = national_id;
	}
	public String getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(String socialSecuritY) {
		this.socialSecurity = socialSecuritY;
	}
}
