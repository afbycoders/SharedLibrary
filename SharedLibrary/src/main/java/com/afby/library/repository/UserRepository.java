package com.afby.library.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.afby.library.entities.User;

public interface UserRepository extends ElasticsearchRepository<User, Double>{

}
