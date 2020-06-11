package com.user;

public class Student {
	
	private String firstName;
	private String lastName;
	private String email;
	private String schoolName;
	private String password;
	private double gpa;
	private Address address;
	
	private double weight;
	private double height;
	private double bmi;
	
	public Student() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getGpa() {
		return gpa;
	}
	
//	public double getGpa(double gpa) {
//	return gpa;
//}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setEmail1(String parameter) {
		// TODO Auto-generated method stub
	
	
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

	public void setBmi(double bmi) {
		// TODO Auto-generated method stub
		this.bmi= bmi;
	
	}
	public double getBmi() {
		return bmi;
	}


}
