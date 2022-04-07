package com.demo.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentInfo")
public class Student {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id ;
	
	@Column
	private String Name;
	@Column
	private String email;
	@Column
	private String phoneNumber;
	@Column
	private String passWord;
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Column
	private String Dob;
	@Column
	private String Course;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", passWord=" + passWord + ", Dob=" + Dob + ", Course=" + Course + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(int id, String name, String email, String phoneNumber, String passWord, String dob, String course) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.passWord = passWord;
		Dob = dob;
		Course = course;
	}
	public Student() {}
	
	
	
	

}
