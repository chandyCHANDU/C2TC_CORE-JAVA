package com.tns.hibernate.classpertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		Employee e = new Employee();
		e.setName("jack");
		e.setSalary(1000001);
		em.persist(e);
		
		Manager d = new Manager();
		d.setName("jenni");
		d.setSalary(200001);
		d.setDepartmentName("Development");
		em.persist(d);
		
		em.getTransaction().commit();
		
		

	}

}