package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			//select * from city
			//List<City> cities = session.createQuery("from City").getResultList();
			
			
			City city =new City();
			city.setName("Duzce 10");
			city.setCountryCode("TUR");
			city.setDistrict("Karadeniz");
			city.setPopulation(100000);
			session.save(city);
			
			
			
			/*
			for (City city:cities) {
				System.out.println(city.getName());
			}
			*/
			session.getTransaction().commit();
		}finally{
			factory.close();
		}
	}

}
