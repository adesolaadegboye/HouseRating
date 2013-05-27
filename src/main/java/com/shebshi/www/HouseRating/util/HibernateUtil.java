package com.shebshi.www.HouseRating.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


import com.shebshi.www.HouseRating.domain.*;


public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	
	public HibernateUtil() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	static {
		try {
			sessionFactory = new AnnotationConfiguration()
			.configure("config/hibernate.cfg.xml")  //if current setting does not work use ****.configure();
			.addPackage("com.shebshi.www.HousingRating.Domain") //the fully qualified package name
			.addAnnotatedClass(Property.class)
			.addAnnotatedClass(LandLord.class)
			.addAnnotatedClass(Tenant.class)
			.addAnnotatedClass(User.class)
			.addAnnotatedClass(PropertyReview.class)
			.buildSessionFactory();
		
			} catch (Throwable ex) {
				System.err.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		 
		public static SessionFactory getSessionFactory() {
		return sessionFactory;
		}
}
