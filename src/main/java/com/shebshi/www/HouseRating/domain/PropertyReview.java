package com.shebshi.www.HouseRating.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class PropertyReview implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3211718564651646811L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	
	@Column(name = "KITCHEN")
	private int kitchenRating;
	
	@Column(name = "LIVING_AREA", nullable=false)
	private int livingAreaRating;
	
	@Column(name = "BEDROOM")
	private int bedroomRating;
	
	@Column(name = "BATHROOM")
	private int bathroomRating;
	
	@Column(name = "TOILET")
	private int wcRating;
	
	@Column(name = "GARDEN")
	private int gardenRating;
	
	@Column(name = "PARKING_AREA")
	private int parkingAreaRating;
	
	@Column(name = "NEIGHBOURHOOD")
	private int neighbourhoodRating;
	
	private CriticType personRating = CriticType.NONE;
	
	
	public int getKitchenRating() {
		return kitchenRating;
	}
	
	public void setKitchenRating(int kitchenRating) {

		parameterSetter(this.kitchenRating, kitchenRating);
		
	}
	
	public int getLivingAreaRating() {
		return livingAreaRating;
	}
	
	public void setLivingAreaRating(int livingAreaRating) {
		// TODO Auto-generated method stub
		parameterSetter(this.livingAreaRating, livingAreaRating);
		
	}

	public void  setBedroomRating(int points) {
		// TODO Auto-generated method stub
		parameterSetter(this.bedroomRating, points);
		
	}
	

	public int  getBedroomRating() {
		
		return bedroomRating;
		
	}
	
	/**
	 * @return the bathroomRating
	 */
	public int getBathroomRating() {
		return bathroomRating;
	}

	/**
	 * @param bathroomRating the bathroomRating to set
	 */
	public void setBathroomRating(int bathroomRating) {
		parameterSetter(this.bathroomRating, bathroomRating);
	}

	/**
	 * @return the wcRating
	 */
	public int getWcRating() {
		return wcRating;
	}

	/**
	 * @param wcRating the wcRating to set
	 */
	public void setWcRating(int wcRating) {
		parameterSetter(this.wcRating, wcRating);
	}

	/**
	 * @return the gardenRating
	 */
	public int getGardenRating() {
		return gardenRating;
	}

	/**
	 * @param gardenRating the gardenRating to set
	 */
	public void setGardenRating(int gardenRating) {
		parameterSetter(this.gardenRating,gardenRating);
	}

	/**
	 * @return the parkingAreaRating
	 */
	public int getParkingAreaRating() {
		return parkingAreaRating;
	}

	/**
	 * @param parkingAreaRating the paringAreaRating to set
	 */
	public void setParkingAreaRating(int parkingAreaRating) {
		parameterSetter(this.parkingAreaRating, parkingAreaRating);
	}
	
	public void parameterSetter(int variable, int value){
		if (value < 0 || value > 10) {
	         throw new IllegalArgumentException();
	      } else {
	         variable = value;
	      }
	}



	/**
	 * @return the neighbourhoodRating
	 */
	public int getNeighbourhoodRating() {
		return neighbourhoodRating;
	}

	/**
	 * @param neighbourhoodRating the neighbourhoodRating to set
	 */
	public void setNeighbourhoodRating(int neighbourhoodRating) {
		this.neighbourhoodRating = neighbourhoodRating;
	}

	// this could be land lord rating or tenant rating. Landlord can only give good rating or no rating to 
	// tenant
	public CriticType getPersonRating() {
		return personRating;
	}

	public void setPersonRating(CriticType personRating) {
		this.personRating = personRating;
	}

	public int getId(){
		return id;
	}
	
}
