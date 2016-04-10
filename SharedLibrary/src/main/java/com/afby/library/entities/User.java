package com.afby.library.entities;

import org.springframework.data.elasticsearch.annotations.Document;

import com.afby.library.common.constants.LibraryConstants;
import com.afby.library.common.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(indexName=LibraryConstants.INDEX_NAME,type=LibraryConstants.USER_TYPE)
public class User extends BaseEntity {

	private String userName;
	
	private String emailId;
	
	private String password;
	
	private String phoneNo;
	
}
