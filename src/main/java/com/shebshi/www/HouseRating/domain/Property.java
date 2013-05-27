package com.shebshi.www.HouseRating.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PROPERTY")
public class Property implements Serializable{

	public Property() {
		super();
	}
	
	public Property(String shortCode) {
		super();
		this.shortCode = shortCode;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -18514512955478353L;
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	
	@Column(name = "SHORTCODE", nullable=false)
	private String shortCode;
	
	@Column(name = "ADDRESS" , nullable=false)
	private String address;
	
	@Column(name = "POSTCODE" , nullable=false)
	private String postcode;
	
	@Column(name ="LANDLORD" , nullable=false)
	private String landlord;
	
	@Column(name = "TENANT" , nullable=false)
	private String tenant;
	
	@Column(name = "CITY", nullable=false) 
	private String city;
	
	@Column(name ="STATE")
	private String state;
	
	@Column(name = "COUNTRY" , nullable=false)
	private String country;
	
	@Column(name = "NUMBER_OF_BEDROOMS")
	private int numberOfBedRooms;
	
	@Column(name =  "NUMBER_OF_LIVING_ROOMS")
	private int numberOfLivingRooms;
	
	@Column(name = "NUMBER_OF_BATHROOMS")
	private int numberOfBathrooms;
	
	@Column(name = "NUMBER_OF_WC")
	private int numberOfWc;
	
	@Column(name = "HAS_PARKING")
	private boolean hasParking;
	/*
	@Column(name = "MONTHLY_ENERGY_CONSUMPTION")
	private double monthlyEnergyConsumption;
	
	@Column(name = "MONTHLY_WATER_CONSUMPTION")
	private double monthwaterConsumption;
	
	@Column(name = "MONTHLY_HEATING_CONSUMPTION")
	private double monthlyHeatingConsumption;
	*/
	
	@Column(name = "PROPERTY_SIZE")
	private double propertySize;
	
	@Column(name = "CONSTRUCTION_YEAR")
	private Date constructionYear;
	
	/**
	 * @return the shortCode
	 */
	public String getShortCode() {
		return shortCode;
	}
	/**
	 * @param shortCode the address to shortCode
	 */
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * @return the landlord
	 */
	public String getLandlord() {
		return landlord;
	}
	/**
	 * @param landlord the landlord to set
	 */
	public void setLandlord(String landlord) {
		this.landlord = landlord;
	}
	/**
	 * @return the tenant
	 */
	public String getTenant() {
		return tenant;
	}
	/**
	 * @param tenant the tenant to set
	 */
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the numberOfBedRooms
	 */
	public int getNumberOfBedRooms() {
		return numberOfBedRooms;
	}
	/**
	 * @param numberOfBedRooms the numberOfBedRooms to set
	 */
	public void setNumberOfBedRooms(int numberOfBedRooms) {
		this.numberOfBedRooms = numberOfBedRooms;
	}
	/**
	 * @return the numberOfLivingArea
	 */
	public int getNumberOfLivingArea() {
		return numberOfLivingRooms;
	}
	/**
	 * @param numberOfLivingArea the numberOfLivingArea to set
	 */
	public void setNumberOfLivingArea(int numberOfLivingArea) {
		this.numberOfLivingRooms = numberOfLivingArea;
	}
	/**
	 * @return the numberOfBathrooms
	 */
	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}
	/**
	 * @param numberOfBathrooms the numberOfBathrooms to set
	 */
	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}
	/**
	 * @return the numberOfWc
	 */
	public int getNumberOfWc() {
		return numberOfWc;
	}
	/**
	 * @param numberOfWc the numberOfWc to set
	 */
	public void setNumberOfWc(int numberOfWc) {
		this.numberOfWc = numberOfWc;
	}
	/**
	 * @return the hasParking
	 */
	public boolean getHasParking() {
		return hasParking;
	}
	/**
	 * @param hasParking the hasParking to set
	 */
	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}
	
	
	/**
	 * @return the propertyArea
	 */
	public double getPropertyArea() {
		return propertySize;
	}
	/**
	 * @param propertyArea the propertyArea to set
	 */
	public void setPropertyArea(double propertyArea) {
		this.propertySize = propertyArea;
	}
	
	/**
	 * @return the constructionYear
	 */
	public Date getConstructionYear() {
		return constructionYear;
	}
	/**
	 * @param constructionYear the constructionYear to set
	 */
	public void setConstructionYear(Date constructionYear) {
		this.constructionYear = constructionYear;
	}

	public int getId(){
		return id;
	}
	
}
