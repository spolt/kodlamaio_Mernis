package Coffeeshop_project.entities;

import java.time.LocalDate;

public class Customer {
	
	int id;
	String firstName;
	String lastName;
	LocalDate birthday;
	String NationalId;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, LocalDate birthday, String nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.NationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getNationalId() {
		return NationalId;
	}

	public void setNationalId(String nationalId) {
		NationalId = nationalId;
	}
	
	
	
	

}
