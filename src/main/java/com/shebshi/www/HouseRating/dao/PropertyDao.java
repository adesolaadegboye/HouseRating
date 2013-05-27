package com.shebshi.www.HouseRating.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.shebshi.www.HouseRating.domain.Property;
import com.shebshi.www.HouseRating.util.HibernateUtil;

@Repository
public class PropertyDao {
	
	
	
	
	@Transactional
	public Property findProperty(String shortName)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Property prop = null;
		try {
			transaction = session.beginTransaction();
			prop = (Property) session.createQuery("from property where shortname = " + shortName );
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
	public Long saveProperty(Property property)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Long propertyId = null;
		try {
			transaction = session.beginTransaction();
			propertyId  = (Long)session.save(property);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return propertyId;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Property> listProperties()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Property> properties = null;
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			properties = session.createQuery("from genericproperty").list();

			for (Property property : properties){
				System.out.println(property.getShortCode());
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
	public void updateProperty(Property property)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Property prop = (Property) session.get(Property.class, property.getId());
			prop.setShortCode(property.getShortCode());
			prop.setAddress(property.getAddress());
			prop.setCity(property.getCity());
			prop.setConstructionYear(property.getConstructionYear());
			prop.setCountry(property.getCountry());
			prop.setHasParking(property.getHasParking());
			prop.setLandlord(property.getLandlord());
			prop.setNumberOfBathrooms(property.getNumberOfBathrooms());
			prop.setNumberOfBedRooms(property.getNumberOfBedRooms());
			prop.setNumberOfLivingArea(property.getNumberOfLivingArea());
			prop.setNumberOfWc(property.getNumberOfWc());
			prop.setPostcode(property.getPostcode());
			prop.setPropertyArea(property.getPropertyArea());
			prop.setState(property.getState());
			prop.setTenant(property.getTenant());
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Transactional
	public void deleteProperty(Property property)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Property  prop = (Property) session.get(Property.class, property.getId());
			session.delete(prop);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public PropertyDao() {
	// TODO Auto-generated constructor stub
	}

}
