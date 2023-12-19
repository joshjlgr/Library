package com.mnl.mynewlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnl.mynewlibrary.entity.LibraryData;

public interface FormLibraryDataRepository extends JpaRepository<LibraryData, Integer> {


}
