package com.mnl.mynewlibrary.dao;

import java.util.List;

import com.mnl.mynewlibrary.entity.Book;

public interface BookDAO {
	 //define the save method prototype
		void saveBook(Book theBook);

		List<Book> findAll();

		void deleteById(int theId);

		Book getById(int theId);

	}