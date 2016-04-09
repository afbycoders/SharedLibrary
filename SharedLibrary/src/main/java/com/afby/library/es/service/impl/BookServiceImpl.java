package com.afby.library.es.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afby.library.common.constants.LibraryConstants;
import com.afby.library.common.es.service.ElasticSearchCommonUtilities;
import com.afby.library.entities.Books;
import com.afby.library.es.service.BookService;
import com.afby.library.repository.BookRepository;

import lombok.Data;

@Data
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private ElasticSearchCommonUtilities esUtilities;
	
	@Override
	public List<Books> getAllBooks() {
		Iterable<Books> booksIterable=bookRepo.findAll();
		List<Books> books =new ArrayList<>();
		booksIterable.forEach(e -> books.add(e));
		return books;
	}

	@Override
	public Books saveBook(Books book) {
		book.setId(esUtilities.generateID(LibraryConstants.BOOK_TYPE));
		return bookRepo.save(book);
	}

}
