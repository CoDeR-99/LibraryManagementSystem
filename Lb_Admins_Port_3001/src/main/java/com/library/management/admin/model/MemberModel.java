package com.library.management.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Members")
public class MemberModel {
	@Id
	private int id;
	private String uname;
	private Integer uadmid;
	private String umail;
	private String udep;
	private String upassword;
	private Integer ustatus;
	private Integer urecstatus;
	private String urecj;
	private String ureqj;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Integer getUadmid() {
		return uadmid;
	}
	public void setUadmid(Integer uadmid) {
		this.uadmid = uadmid;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getUdep() {
		return udep;
	}
	public void setUdep(String udep) {
		this.udep = udep;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Integer getUstatus() {
		return ustatus;
	}
	public void setUstatus(Integer ustatus) {
		this.ustatus = ustatus;
	}
	public Integer getUrecstatus() {
		return urecstatus;
	}
	public void setUrecstatus(Integer urecstatus) {
		this.urecstatus = urecstatus;
	}
	public String getUrecj() {
		return urecj;
	}
	public void setUrecj(String urecj) {
		this.urecj = urecj;
	}
	public String getUreqj() {
		return ureqj;
	}
	public void setUreqj(String ureqj) {
		this.ureqj = ureqj;
	}
	public MemberModel(int id, String uname, Integer uadmid, String umail, String udep, String upassword,
			Integer ustatus, Integer urecstatus, String urecj, String ureqj) {
		super();
		this.id = id;
		this.uname = uname;
		this.uadmid = uadmid;
		this.umail = umail;
		this.udep = udep;
		this.upassword = upassword;
		this.ustatus = ustatus;
		this.urecstatus = urecstatus;
		this.urecj = urecj;
		this.ureqj = ureqj;
	}
	public MemberModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
