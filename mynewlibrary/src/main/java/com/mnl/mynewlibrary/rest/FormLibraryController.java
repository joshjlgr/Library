package com.mnl.mynewlibrary.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mnl.mynewlibrary.dao.FormLibraryDataRepository;
import com.mnl.mynewlibrary.entity.LibraryData;

@Controller
public class FormLibraryController {

	@Autowired
	private FormLibraryDataRepository formLibraryDataRepository;
	
	// Step 1: display the form to input data
	// localhost:8080/mnlform
	
@GetMapping("/mnlform")
public String showForm(Model model) {
	model.addAttribute("libraryData", new LibraryData());
	return "/DataLibraryForm";
}

// Step 2: process the form data: save into the database
@PostMapping("/mnlform")
public String saveForm(LibraryData libraryData) {
	formLibraryDataRepository.save(libraryData);
	return "/DataLibraryForm";
}


@GetMapping("/deleteform")
public String deleteForm(Model model) {
	model.addAttribute("libraryData", new LibraryData());
	return "/DeleteBook";
}
//Step 3: process the form data: save into the database
@DeleteMapping("/deleteform")
public String deleteForm(int id) {
	formLibraryDataRepository.deleteById(id);
	return "/DataLibraryForm";
}
}



