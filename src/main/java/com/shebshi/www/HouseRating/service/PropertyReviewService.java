package com.shebshi.www.HouseRating.service;

import java.util.List;

import com.shebshi.www.HouseRating.dao.PropertyReviewDao;
import com.shebshi.www.HouseRating.domain.PropertyReview;

public interface PropertyReviewService {
	
	public boolean createNewPropertyReview(PropertyReview PropertyReview);
	
	public PropertyReview findPropertyReview(int id );
	
	public boolean UpdatePropertyReview(PropertyReview PropertyReview);
	
	public PropertyReviewDao getPropertyReviewDao();
	
	public void setPropertyReviewDao(PropertyReviewDao PropertyReviewDao);
	
	public List<PropertyReview> ListPropertyReviews();

}
