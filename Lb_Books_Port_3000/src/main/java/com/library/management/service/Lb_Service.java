package com.library.management.service;

import java.util.List;

import com.library.management.model.BooksModel;

public interface Lb_Service {

	BooksModel SaveInto();

	List<BooksModel> GetByStatus(String bstatus);

	List<BooksModel> GetAll();

	BooksModel GetByID(String id);

	Boolean AddBook(BooksModel bmodel);

	Boolean DeleteById(String id);

	Boolean UpdateBook(String id, BooksModel bmodel);

}
