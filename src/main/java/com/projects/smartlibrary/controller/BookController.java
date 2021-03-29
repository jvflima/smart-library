package com.projects.smartlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.smartlibrary.model.Book;
import com.projects.smartlibrary.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Book> listAll(){
		return bookRepository.findAll();
		
	}
	
	//@PostMapping
	//public void addBook(@RequestBody Book book) {
	//	bookRepository.save(book);
	//}
	
}
