package com.shebshi.www.HouseRating.domain;


import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="LANDLORD")
public class LandLord extends Person {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7386420274208041645L;
	private TenancyType tenancyType = TenancyType.NONE;
	
	/**
	 * @return the tenancyType
	 */
	public TenancyType getTenancyType() {
		return tenancyType;
	}
	/**
	 * @param tenancyType the tenancyType to set
	 */
	public void setTenancyType(TenancyType tenancyType) {
		this.tenancyType = tenancyType;
	}



}
