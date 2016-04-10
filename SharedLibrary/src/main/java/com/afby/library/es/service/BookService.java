package com.afby.library.es.service;

import java.util.List;

import com.afby.library.entities.Book;

public interface BookService {

	List<Book> getAllBooks();
	
	Book saveBook(Book book);
	
	Book updateBook(Book book);
	
	Book findBookById(Double id);
}
