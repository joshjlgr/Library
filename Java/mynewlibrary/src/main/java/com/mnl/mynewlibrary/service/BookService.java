package com.mnl.mynewlibrary.service;

import java.util.List;

import com.mnl.mynewlibrary.entity.Book;

public interface BookService {
	
	void saveBook(Book theBook);
	
	List<Book> findAll();
	
	void deleteById(int theId);

	Book getById(int id);
	
	
}
