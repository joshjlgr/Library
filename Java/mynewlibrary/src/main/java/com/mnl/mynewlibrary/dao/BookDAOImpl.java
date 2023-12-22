package com.mnl.mynewlibrary.dao;

import java.util.List;
//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mnl.mynewlibrary.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

	@Repository
	public class BookDAOImpl implements BookDAO{
	
	// define a variable for EntityManager
	private EntityManager entityManager;
	
	@Autowired
	// define a constructor to initialize the entity manager
	public BookDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	// define the method to save the record in the table
	// add GetMapping to the method
	@Override
	public void saveBook(Book theBook) {
		entityManager.merge(theBook);
	}
	
	@Override
	public List<Book> findAll(){
	// implementing SELECT*
		
		TypedQuery<Book>theQuery = entityManager.createQuery("from Book",Book.class);
	    List<Book> books = theQuery.getResultList();
		return books;
	}
		
	@Override
	public Book getById(int theId) {
		Book b = entityManager.find(Book.class,theId);
		System.out.println("\n DAO says " + b.toString());
		return b;
	}
	
	
//		
//		}

	@Override
	public void deleteById(int theId) {
				
		Book s = entityManager.find(Book.class, theId);
        entityManager.remove(s);
		
	}
}
	
/*
 * @component - can be used anytime to mark the beans as manage
 * 
 * @repository - used for the classes that are part of DAO and help performing CRUD. 
 * it is special type of component
 * 
 * @service - is also a component used in business logic
 * 
 * @RestController
 */