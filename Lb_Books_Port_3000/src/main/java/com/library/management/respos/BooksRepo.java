package com.library.management.respos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.library.management.model.BooksModel;

public interface BooksRepo extends MongoRepository<BooksModel, Integer> {

	List<BooksModel> findByBstatus(String bstatus);

}
