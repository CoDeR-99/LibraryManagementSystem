package com.library.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.model.BooksModel;
import com.library.management.service.Lb_Service;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping
public class Lb_Controller {
	@Autowired
	private Lb_Service lbservice;

	@GetMapping("/Books")
	public ResponseEntity<List<BooksModel>> Test3() {
		List<BooksModel> response= lbservice.GetAll();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/Books/")
	public ResponseEntity<List<BooksModel>> GetByStatus(@RequestParam(value = "bstatus") String bstatus) {
		List<BooksModel> response =lbservice.GetByStatus(bstatus);
		System.out.println(bstatus);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/Books/{id}")
	public ResponseEntity<BooksModel> GetById(@PathVariable(name = "id") String id) {
		BooksModel Bmodel = new BooksModel();
		Bmodel = lbservice.GetByID(id);
		return new ResponseEntity<BooksModel>(Bmodel, HttpStatus.OK);
	}

	@PostMapping("/Books")
	public ResponseEntity AddBook(@RequestBody BooksModel Bmodel) {
		Boolean response = lbservice.AddBook(Bmodel);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}

	@DeleteMapping("/Books/{id}")
	public ResponseEntity DeleteBook(@PathVariable(name = "id") String id) {
		Boolean response = lbservice.DeleteById(id);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}
	@PutMapping("/Books/{id}")
	public ResponseEntity updateBook(@PathVariable(name = "id") String id,@RequestBody BooksModel Bmodel)
	{
		Boolean response = lbservice.UpdateBook(id,Bmodel);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Wrong Book ID", HttpStatus.OK);
		}
	}

}
