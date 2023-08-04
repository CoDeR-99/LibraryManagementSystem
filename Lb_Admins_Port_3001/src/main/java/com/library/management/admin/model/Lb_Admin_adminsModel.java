package com.library.management.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="admins")
public class Lb_Admin_adminsModel {
	
	@Id
	private int id;
	private String amail;
	private String apassword;
	private String aname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAmail() {
		return amail;
	}
	public void setAmail(String amail) {
		this.amail = amail;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Lb_Admin_adminsModel(int id, String amail, String apassword, String aname) {
		super();
		this.id = id;
		this.amail = amail;
		this.apassword = apassword;
		this.aname = aname;
	}
	public Lb_Admin_adminsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
