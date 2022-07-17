package com.test.Students.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentsRecord {
	
	@Id
	private int Sid;
	private String Sname;
	private String Address;
	private String Email;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public StudentsRecord(int sid, String sname, String address, String email) {
		super();
		Sid = sid;
		Sname = sname;
		Address = address;
		Email = email;
	}
	public StudentsRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentsRecord [Sid=" + Sid + ", Sname=" + Sname + ", Address=" + Address + ", Email=" + Email + "]";
	}
	
	

}
