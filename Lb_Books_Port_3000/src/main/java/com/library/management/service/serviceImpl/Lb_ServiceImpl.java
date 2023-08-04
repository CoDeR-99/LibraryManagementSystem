package com.library.management.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.management.model.BooksModel;
import com.library.management.respos.BooksRepo;
import com.library.management.service.Lb_Service;

@Service
@Transactional
public class Lb_ServiceImpl implements Lb_Service {

	@Autowired
	private BooksRepo bookrepo;

	@Override
	public BooksModel SaveInto() {
		// TODO Auto-generated method stub
		BooksModel BModel = new BooksModel();
		BModel.setBtitle("Uncle Bun");
		BModel.setBcatag("Adventure");
		BModel.setBstatus("Old");
		BModel.setBcopies(0);
		BModel.setBisbn("KSD15L12");
		BModel.setByear(2014);
		BModel.setBauthor("Chicham Pd");
		BModel.setBdate("2022-03-27");
		return bookrepo.save(BModel);

	}

	@Override
	public List<BooksModel> GetAll() {
		

		List<BooksModel> data = bookrepo.findAll();
		
		return data;
	}

	@Override
	public List<BooksModel> GetByStatus(String bstatus) {
	

		List<BooksModel> data = bookrepo.findByBstatus(bstatus);
		
		return data;
	}

	@Override
	public BooksModel GetByID(String id) {
		// TODO Auto-generated method stub
		BooksModel Bmodel = null;
		try {
			Bmodel = bookrepo.findById(Integer.valueOf(id)).get();
		} catch (Exception e) {
			System.out.println("No Data Found in This Id  ");
			return Bmodel;
		}
		if (Bmodel != null) {
			return Bmodel;
		} else {

			return Bmodel;
		}
	}

	@Override
	public Boolean AddBook(BooksModel bmodel) {
		// TODO Auto-generated method stub
		Boolean response = false;
		try {
			bookrepo.save(bmodel);
			response = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	@Override
	public Boolean DeleteById(String id) {
		// TODO Auto-generated method stub
		Boolean response = false;
		try {
			BooksModel BModel = bookrepo.findById(Integer.valueOf(id)).get();
			if (BModel != null) {
				bookrepo.deleteById(Integer.valueOf(id));
				response = true;
			}
		} catch (Exception e) {
			System.out.println("No Data Found On this Id ");
		}
		return response;
	}

	@Override
	public Boolean UpdateBook(String id, BooksModel bmodel) {
		Boolean response = false;
		try {
			BooksModel BModel = bookrepo.findById(Integer.valueOf(id)).get();
			if (BModel != null) {
				bookrepo.save(bmodel);
				response = true;
			}
		} catch (Exception e) {
			System.out.println("You Enter Wrong Book Id ");
		}
		return response;
	}

}
