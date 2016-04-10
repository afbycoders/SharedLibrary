package com.afby.library.common.entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseEntity {

	@Id
	private Double id;
	
}
