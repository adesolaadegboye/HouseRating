package com.shebshi.www.HouseRating.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.shebshi.www.HouseRating.domain.PropertyReview;
import com.shebshi.www.HouseRating.util.HibernateUtil;

@Repository
public class PropertyReviewDao {
	
	
	
	
	@Transactional
	public PropertyReview findPropertyReview(String shortName)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		PropertyReview prop = null;
		try {
			transaction = session.beginTransaction();
			prop = (PropertyReview) session.createQuery("from PropertyReview where shortname = " + shortName );
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return prop;
	}

	@Transactional
	public Long savePropertyReview(PropertyReview PropertyReview)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Long PropertyReviewId = null;
		try {
			transaction = session.beginTransaction();
			PropertyReviewId = (Long)session.save(PropertyReview);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return PropertyReviewId;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<PropertyReview> listPropertyReviews()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<PropertyReview> properties = null;
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			properties = session.createQuery("from PropertyReview").list();

			for (PropertyReview PropertyReview : properties){
				System.out.println(PropertyReview.getId());
			}

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return properties;
	}
	

	@Transactional
	public void updatePropertyReview(PropertyReview PropertyReview)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			PropertyReview propRev = (PropertyReview) session.get(PropertyReview.class, PropertyReview.getId());
			propRev.setBathroomRating(PropertyReview.getBathroomRating());
			propRev.setGardenRating(PropertyReview.getGardenRating());
			propRev.setBedroomRating(PropertyReview.getBedroomRating());
			propRev.setKitchenRating(PropertyReview.getGardenRating());
			propRev.setLivingAreaRating(PropertyReview.getLivingAreaRating());
			propRev.setParkingAreaRating(PropertyReview.getParkingAreaRating());
			propRev.setWcRating(PropertyReview.getWcRating());
			propRev.setNeighbourhoodRating(PropertyReview.getNeighbourhoodRating());
			propRev.setPersonRating(PropertyReview.getPersonRating());
			
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Transactional
	public void deletePropertyReview(PropertyReview PropertyReview)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			PropertyReview  prop = (PropertyReview) session.get(PropertyReview.class, PropertyReview.getId());
			session.delete(prop);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public PropertyReviewDao() {
	// TODO Auto-generated constructor stub
	}

}
