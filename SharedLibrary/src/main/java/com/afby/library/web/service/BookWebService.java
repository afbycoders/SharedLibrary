package com.afby.library.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afby.library.entities.Books;
import com.afby.library.es.service.BookService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RestController
public class BookWebService {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/storeBook")
	public Books storeBook(@RequestParam String name,@RequestParam String authName,@RequestParam String publisher){
		Books book=new Books();
		book.setBookName(name);
		book.setAuthorName(authName);
		book.setPublisher(publisher);
		
		return bookService.saveBook(book);
	}
	
	@RequestMapping("/getAllBooks")
	public List<Books> getAllBooks(){
		return bookService.getAllBooks();
	}
}
