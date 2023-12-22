package com.mnl.mynewlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mnl.mynewlibrary.entity.Book;


//mention the class name and data type of primary key for JpaRepository
@Service
public interface BookRepository extends JpaRepository<Book, Integer> {
	// all the methods related to the CRUD are available. No need to write anything
}

//1. create a copy of the project in the new folder
//2. relaunch eclipse with new workspace
//3. import proj as maven proj