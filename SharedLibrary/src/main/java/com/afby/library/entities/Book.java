package com.afby.library.entities;

import org.springframework.data.elasticsearch.annotations.Document;

import com.afby.library.common.constants.LibraryConstants;
import com.afby.library.common.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(indexName=LibraryConstants.INDEX_NAME,type=LibraryConstants.BOOK_TYPE)
public class Book extends BaseEntity{

	/*@Id
	private Double id;
	*/
	private String bookName;
	
	private String authorName;
	
	private String publisher;
	
	private Double owner;
}
