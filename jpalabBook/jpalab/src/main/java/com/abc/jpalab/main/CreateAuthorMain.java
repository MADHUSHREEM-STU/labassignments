package com.abc.jpalab.main;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpalab.entity.Author;

public class CreateAuthorMain {
	public static void main(String[] args) {
		Author author = new Author();
		author.setAuthorId(3);
		author.setFirstName("divya");
		author.setMiddleName("shree");
		author.setLastName("m");
		author.setPhoneNumber(543728929);
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		
		em.persist(author);
		
		txn.commit();
		System.out.println("author saved");
		em.close();
		emf.close();
	}
}
