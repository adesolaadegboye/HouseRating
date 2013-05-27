package com.shebshi.www.HouseRating.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TENANT")
public class Tenant extends Person{

/**
	 * 
	 */
	private static final long serialVersionUID = -4849448997553116698L;
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
