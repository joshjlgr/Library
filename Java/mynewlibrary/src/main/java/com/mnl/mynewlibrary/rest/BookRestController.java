package com.mnl.mynewlibrary.rest;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mnl.mynewlibrary.dao.BookDAO;
import com.mnl.mynewlibrary.entity.Book;
import com.mnl.mynewlibrary.service.BookService;

@RequestMapping("/api")
@RestController
public class BookRestController {
	
	//define a variable
	private BookService bookService;
	
	public BookRestController(BookService bkService){
		this.bookService = bkService;
	}
	
//	@GetMapping("/create")
//	//define a method with GetMapping
//	public String createRecord() {
//		Book s = new Book(4,"Gabriel","Saliba","centerback@goat.mail");
//	
//	BookService.saveBook(s);
//	return "Record saved in the table";
// }

	// store data in a database.get the data from user in form of an object.object will be stored
	// @RequestBody
	//POST localhost:8080/api/books
	
	@PostMapping("/postbooks")
	public String addBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return "Data saved to the table";
	}
	
	//update record PUT localhost:8080/api/books

	@PutMapping("/putbooks")
	public String updateBook(@RequestBody Book bk){
//	public Book updateBook(@RequestBody Book bk){
//	 Book dbBook = BookService.saveBook(bk);
//	 return dbBook;
		bookService.saveBook(bk);
		return "Record Updated";
	 }
	
	@GetMapping("/getallbooks")
	//define a method with GetMapping for showing the Books
	public String selectAll() {
		bookService.findAll();
		return "All Book Records"; 
	}
	
	@GetMapping("/getbook")
	//define a method with GetMapping for showing the Books
	public Book getBook(@RequestParam int Id) {
		Book b = bookService.getById(Id);
		System.out.println(b.toString());
		return b; 
	}
	
	//localhost:8080/api/delBooks?id=0
	
	@DeleteMapping("/deletebooks")
	public String deleteBook(@RequestParam int Id) {
		bookService.deleteById(Id);
		return "Record deleted!!!"; 
	}	
	
	
}

