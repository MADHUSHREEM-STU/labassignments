package com.abc.jpalab.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpalab.entity.Author;

public class DeleteAuthorMain {
public static void main(String[] args) {
		
		int authorId = 2;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Author author = em.find(Author.class, authorId);
		
		if(author!=null) {
			
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			
			em.remove(author);
			
			txn.commit();
			System.out.println("author deleted");
		}
		else {
			System.out.println("author not existing with id: "+authorId);
		}
		
		em.clear();
		em.close();

	}
}
