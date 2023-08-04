package com.library.management.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Books")
public class BooksModel {
	
	@Id
	private int id;
	private String btitle;
	private String bcatag;
	private String bstatus;
	private Integer bcopies;
	private String bisbn;
	private Integer byear;
	private String bauthor;
	private String bpub;
	private String pubname;
	private String bdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcatag() {
		return bcatag;
	}
	public void setBcatag(String bcatag) {
		this.bcatag = bcatag;
	}
	public String getBstatus() {
		return bstatus;
	}
	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}
	public Integer getBcopies() {
		return bcopies;
	}
	public void setBcopies(Integer bcopies) {
		this.bcopies = bcopies;
	}
	public String getBisbn() {
		return bisbn;
	}
	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}
	public Integer getByear() {
		return byear;
	}
	public void setByear(Integer byear) {
		this.byear = byear;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getBpub() {
		return bpub;
	}
	public void setBpub(String bpub) {
		this.bpub = bpub;
	}
	public String getPubname() {
		return pubname;
	}
	public void setPubname(String pubname) {
		this.pubname = pubname;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public BooksModel(int id, String btitle, String bcatag, String bstatus, Integer bcopies, String bisbn,
			Integer byear, String bauthor, String bpub, String pubname, String bdate) {
		super();
		this.id = id;
		this.btitle = btitle;
		this.bcatag = bcatag;
		this.bstatus = bstatus;
		this.bcopies = bcopies;
		this.bisbn = bisbn;
		this.byear = byear;
		this.bauthor = bauthor;
		this.bpub = bpub;
		this.pubname = pubname;
		this.bdate = bdate;
	}
	public BooksModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
