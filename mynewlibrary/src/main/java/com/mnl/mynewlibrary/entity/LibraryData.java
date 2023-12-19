package com.mnl.mynewlibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	
@Entity
@Table(name="book")
public class LibraryData {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// define class variables
		private int Id;	
		private int Pages;
		private String Author;
		private String Category;
		private String Isbn;
		private String Title;
		
		
		public LibraryData(int id, int pages, String author, String category, String isbn, String title) {
			super();
			Id = id;
			Pages = pages;
			Author = author;
			Category = category;
			Isbn = isbn;
			Title = title;
		}
		
			
		public int getId() {
			return Id;
		}


		public void setId(int id) {
			Id = id;
		}


		public LibraryData() {
			// TODO Auto-generated constructor stub
		}


		public int getPages() {
			return Pages;
		}


		public void setPages(int pages) {
			Pages = pages;
		}


		public String getAuthor() {
			return Author;
		}


		public void setAuthor(String author) {
			Author = author;
		}


		public String getCategory() {
			return Category;
		}


		public void setCategory(String category) {
			Category = category;
		}


		public String getIsbn() {
			return Isbn;
		}


		public void setIsbn(String isbn) {
			Isbn = isbn;
		}


		public String getTitle() {
			return Title;
		}


		public void setTitle(String title) {
			Title = title;
		}


		@Override
		public String toString() {
			return "LibraryData [Id=" + Id + ", Pages=" + Pages + ", Author=" + Author + ", Category=" + Category
					+ ", Isbn=" + Isbn + ", Title=" + Title + "]";
		}

		
};
