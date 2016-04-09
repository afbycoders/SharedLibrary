package com.afby.library.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.afby.library.entities.Books;

public interface BookRepository extends ElasticsearchRepository<Books, Double> {
}
