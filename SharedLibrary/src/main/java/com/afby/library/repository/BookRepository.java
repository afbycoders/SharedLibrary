package com.afby.library.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.afby.library.entities.Book;

public interface BookRepository extends ElasticsearchRepository<Book, Double> {
}
