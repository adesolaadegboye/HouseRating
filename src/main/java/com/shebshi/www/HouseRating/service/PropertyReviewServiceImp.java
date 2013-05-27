package com.shebshi.www.HouseRating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.shebshi.www.HouseRating.dao.PropertyReviewDao;
import com.shebshi.www.HouseRating.domain.PropertyReview;

@Service
public class PropertyReviewServiceImp implements PropertyReviewService {
	
	@Autowired
	private PropertyReviewDao PropertyReviewDao;
	
	@NotNull
	@Size(min = 1, max = 10)
	private int rating;
	
	@NotNull
	private String shortName; 
	
	public PropertyReviewServiceImp() {
		// TODO Auto-generated constructor stub
	}

	public PropertyReview findPropertyReview(int id)
	{
		PropertyReview PropertyReview = null;
		PropertyReview = PropertyReviewDao.findPropertyReview(shortName);
		return PropertyReview;
			
	}
	
	public boolean createNewPropertyReview(PropertyReview PropertyReview){
		boolean rtValue = true;
		Long PropertyReviewId = 0L;
		PropertyReviewId = PropertyReviewDao.savePropertyReview(PropertyReview);
		if (PropertyReviewId == 0)
			rtValue = false;
		
		return rtValue;
	}
	
	public boolean UpdatePropertyReview(PropertyReview PropertyReview){
		boolean rtValue = true;
		PropertyReviewDao.updatePropertyReview(PropertyReview);
		return rtValue;
	}
	
	public List<PropertyReview> ListPropertyReviews(){
		
		return PropertyReviewDao.listPropertyReviews();
	}
	
	public PropertyReviewDao getPropertyReviewDao() {
		return PropertyReviewDao;
	}

	public void setPropertyReviewDao(PropertyReviewDao PropertyReviewDao) {
		this.PropertyReviewDao = PropertyReviewDao;
	}

}
