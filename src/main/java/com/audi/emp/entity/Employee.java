package com.audi.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //no need add id in json
	private Long id;
	private String firstName;
	private String lastName;
	private String email;

//    {
//   //   "id": 6,
//        "firstName": "ABC",
//        "lastName": "XYZ",
//        "email": "ABC.XYZ.com"
//    }

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
}
