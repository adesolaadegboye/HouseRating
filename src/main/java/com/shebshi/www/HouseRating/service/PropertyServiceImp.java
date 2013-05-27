package com.shebshi.www.HouseRating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.shebshi.www.HouseRating.dao.PropertyDao;
import com.shebshi.www.HouseRating.domain.Property;

@Service
public class PropertyServiceImp implements PropertyService {
	
	@Autowired
	private PropertyDao propertyDao;
	
	@NotNull
	@Size(min = 1, max = 10)
	private int rating;
	
	@NotNull
	private String shortName; 
	
	public PropertyServiceImp() {
		// TODO Auto-generated constructor stub
	}

	public Property findProperty(String shortName )
	{
		Property property = null;
		property = propertyDao.findProperty(shortName);
		return property;
			
	}
	
	public boolean createNewProperty(Property property){
		boolean rtValue = true;
		Long propertyId = 0L;
		propertyId = propertyDao.saveProperty(property);
		if (propertyId == 0)
			rtValue = false;
		
		return rtValue;
	}
	
	public boolean UpdateProperty(Property property){
		boolean rtValue = true;
		propertyDao.updateProperty(property);
		return rtValue;
	}
	
	public List<Property> ListProperties(){
		
		return propertyDao.listProperties();
	}
	
	public PropertyDao getPropertyDao() {
		return propertyDao;
	}

	public void setPropertyDao(PropertyDao propertyDao) {
		this.propertyDao = propertyDao;
	}

}
