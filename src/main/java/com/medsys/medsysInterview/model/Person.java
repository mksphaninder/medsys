package com.medsys.medsysInterview.model;

import java.util.Date;

public class Person {
	private Integer id;
	private String fname;
	private String lname;
	private Date dob;
	private String addr1;
	private String addr2;
	private String city;
	private String state;
	int zip;
	

	public Person(Integer id, String fname, String lname, Date dob, String addr1, String addr2, String city, String state, int zip) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	//Getters & setters
	
	
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Person [id=" + id +", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", addr1=" + addr1 + ", addr2=" + addr2
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
}
