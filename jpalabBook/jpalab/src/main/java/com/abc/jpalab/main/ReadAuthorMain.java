package com.abc.jpalab.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpalab.entity.Author;

public class ReadAuthorMain {
	public static void main(String[] args) {
		int authorId = 2;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();

		Author author = em.find(Author.class, authorId);
		

		if(author !=null) {
			System.out.println("FirstName: " +author.getFirstName());
			System.out.println("MiddleName: " +author.getMiddleName());
			System.out.println("LastName: " +author.getLastName());
			System.out.println("LastName: " +author.getPhoneNumber());
		}
		else {
			System.out.println("author not existing with id: "+authorId);
		}
		
		em.clear();
		em.close();
	}
}
