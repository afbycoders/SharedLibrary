package com.afby.library.es.service;

import java.util.List;

import com.afby.library.entities.Books;

public interface BookService {

	List<Books> getAllBooks();
	
	Books saveBook(Books book);
}
