package com.afby.library.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afby.library.entities.Book;
import com.afby.library.es.service.BookService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RestController
@RequestMapping("/bookService")
public class BookWebService {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/storeBook")
	public Book storeBook(@RequestParam String name,@RequestParam String authName,@RequestParam String publisher){
		Book book=new Book();
		book.setBookName(name);
		book.setAuthorName(authName);
		book.setPublisher(publisher);
		
		return bookService.saveBook(book);
	}
	
	@RequestMapping("/getAllBooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/getBook")
	public Book getBook(@RequestParam Double id){
		return bookService.findBookById(id);
	}
	
	@RequestMapping("/updateBook")
	public Book updateBook(@RequestParam Double id){
		Book book=bookService.findBookById(id);
		book.setPublisher("INDIAN");
		return bookService.updateBook(book);
	}
}
