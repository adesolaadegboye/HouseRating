package com.shebshi.www.HouseRating.service;

import java.util.List;

import com.shebshi.www.HouseRating.dao.PropertyDao;
import com.shebshi.www.HouseRating.domain.Property;

public interface PropertyService {
	
	public boolean createNewProperty(Property property);
	
	public Property findProperty(String shortName );
	
	public boolean UpdateProperty(Property property);
	
	public PropertyDao getPropertyDao();
	
	public void setPropertyDao(PropertyDao propertyDao);
	
	public List<Property> ListProperties();

}
