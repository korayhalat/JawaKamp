package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate birthOfDate;
	private String identityNumber;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email, LocalDate birthOfDate, String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthOfDate = birthOfDate;
		this.identityNumber = identityNumber;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}


	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}


	public String getIdentityNumber() {
		return identityNumber;
	}


	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
}
