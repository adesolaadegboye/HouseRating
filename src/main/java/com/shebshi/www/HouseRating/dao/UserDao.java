package com.shebshi.www.HouseRating.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.shebshi.www.HouseRating.domain.User;
import com.shebshi.www.HouseRating.util.HibernateUtil;

@Repository
public class UserDao {
	
	
	
	
	@Transactional
	public User findUser(int id)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		User user = null;
		try {
			transaction = session.beginTransaction();
			user = (User) session.createQuery("from User where ID = " + id );
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return user;
	}

	@Transactional
	public Long saveProperty(User user)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Long userId = null;
		try {
			transaction = session.beginTransaction();
			userId = (Long) session.save(user);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return userId;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<User> listUsers()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<User> users = null;
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			users = session.createQuery("from Users").list();

			for (User user : users){
				System.out.println(user.getId());
			}

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return users;
	}
	

	@Transactional
	public void updateUser(User user)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			User usr  = (User) session.get(User.class, user.getId());
			usr.setAddress(user.getAddress());
			usr.setDateOfBirth(user.getDateOfBirth());
			usr.setEmail(user.getEmail());
			usr.setFacebookUrl(user.getFacebookUrl());
			usr.setFirstName(user.getFirstName());
			usr.setLastName(user.getLastName());
			usr.setLinkedInUrl(user.getLinkedInUrl());
			usr.setMobilTelephone(user.getMobilTelephone());
			usr.setNational_id(user.getNational_id());
			usr.setNationalIdentification(user.getNationalIdentification());
			usr.setNationality(user.getNationality());
			usr.setNextOfKin(user.getNextOfKin());
			usr.setOtherName(user.getOtherName());
			usr.setSocialSecurity(user.getSocialSecurity());
			usr.setUserName(user.getUserName());
			usr.setPassword(user.getPassword());
			usr.setPostCode(user.getPostCode());
			usr.setTelefone(user.getTelefone());
			usr.setTwitterUrl(user.getTwitterUrl());	
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Transactional
	public void deleteProperty(User user)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			User  usr = (User) session.get(User.class, user.getId());
			session.delete(usr);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public UserDao() {
	// TODO Auto-generated constructor stub
	}

}
