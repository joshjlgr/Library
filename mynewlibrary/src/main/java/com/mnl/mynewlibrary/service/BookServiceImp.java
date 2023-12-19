package com.mnl.mynewlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnl.mynewlibrary.dao.BookDAO;
import com.mnl.mynewlibrary.entity.Book;
import com.mnl.mynewlibrary.service.BookService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import jakarta.transaction.Transactional;

@Service
public class BookServiceImp implements BookService {

//create private variable for dao
	private BookDAO bookDAO;
	//create constructor to instantiate the dao	
	@Autowired
	public BookServiceImp(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	// define the methods	
	@Override
	@Transactional
	public void saveBook(Book theBook) {
		bookDAO.saveBook(theBook);
	}
	@Override
	public List<Book> findAll() {
		List<Book>sList = bookDAO.findAll();
		return sList;
	}
	@Override
	@Transactional
	public void deleteById(int theId) {
		bookDAO.deleteById(theId);		
	}
	@Override
	public String getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

