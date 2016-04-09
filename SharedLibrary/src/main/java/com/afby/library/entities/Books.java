package com.afby.library.entities;

import org.springframework.data.elasticsearch.annotations.Document;

import com.afby.library.common.constants.LibraryConstants;

import lombok.Data;

@Data
@Document(indexName=LibraryConstants.INDEX_NAME,type=LibraryConstants.BOOK_TYPE)
public class Books {

	private Double id;
	
	private String bookName;
	
	private String authorName;
	
	private String publisher;
	
	private Double owner;
}
