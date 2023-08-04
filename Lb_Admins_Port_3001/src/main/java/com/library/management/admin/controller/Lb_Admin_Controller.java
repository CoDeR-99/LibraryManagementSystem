package com.library.management.admin.controller;

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

import com.library.management.admin.model.Lb_Admin_adminsModel;
import com.library.management.admin.model.MemberModel;
import com.library.management.admin.service.Lb_Admin_Sevice;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping
public class Lb_Admin_Controller {

	@Autowired
	private Lb_Admin_Sevice lbadminservice;

//	Lb_Member_Response

	@GetMapping("/test")
	public String test() {
		return "welcome";
	}

	@GetMapping("/admins")
	public ResponseEntity<List<Lb_Admin_adminsModel>> getAdmin() {
		List<Lb_Admin_adminsModel> response = lbadminservice.GetAdminList();

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/admins/{id}")
	public ResponseEntity<Lb_Admin_adminsModel> getById(@PathVariable("id") String id) {
		Lb_Admin_adminsModel response = new Lb_Admin_adminsModel();
		response = lbadminservice.getByID(id);
		return new ResponseEntity<Lb_Admin_adminsModel>(response, HttpStatus.OK);
	}
	

	@GetMapping("/members")
	public ResponseEntity<List<MemberModel>> Test3() {
		List<MemberModel> response = lbadminservice.GetAll();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	

	@PostMapping("/members")
	public ResponseEntity AddMember(@RequestBody MemberModel Bmodel) {
		Boolean response = lbadminservice.AddMember(Bmodel);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}

	@DeleteMapping("/members/{id}")
	public ResponseEntity DeleteBook(@PathVariable(name = "id") String id) {
		Boolean response = lbadminservice.DeleteById(id);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}

	@PutMapping("/members/{id}")
	public ResponseEntity updateMember(@PathVariable(name = "id") String id, @RequestBody MemberModel Bmodel) {
		Boolean response = lbadminservice.UpdateMember(id, Bmodel);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}
	@GetMapping("/members/{id}")
	public ResponseEntity<MemberModel> GetMemberByID(@PathVariable("id") String id) {
		MemberModel response = new MemberModel();
		response = lbadminservice.GetMemberByID(id);
		return new ResponseEntity<MemberModel>(response, HttpStatus.OK);
	}
	@GetMapping("/members$")
	public ResponseEntity<List<MemberModel>> GETuserByStatus(@RequestParam("ustatus") String ustatus) {
	
		List<MemberModel>response = lbadminservice.GetBYStatus(ustatus);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@GetMapping("/members@")
	public ResponseEntity<List<MemberModel>> GETuserByRecStatus(@RequestParam("urecstatus") String urecstatus) {
		List<MemberModel> response =lbadminservice.GetBYRecStatus(urecstatus);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	

}
