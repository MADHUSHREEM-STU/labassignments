package com.abc.jpalab.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpalab.entity.Author;

public class UpdateAuthorMain {
public static void main(String[] args) {
		
		Author author = new Author();
		author.setAuthorId(2);
		author.setFirstName("navya");
		author.setMiddleName("shree");
		author.setLastName("m");
		author.setPhoneNumber(687358184);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.merge(author);	
		
		txn.commit();
		
		System.out.println("author Updated");
		
		em.close();
		emf.close();
		

	}
}
