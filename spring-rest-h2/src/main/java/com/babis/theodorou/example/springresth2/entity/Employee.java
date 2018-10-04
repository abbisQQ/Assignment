package com.babis.theodorou.example.springresth2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This is the entity class where the we map each field with it's counterpart in the database.

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	//Identity sequencing uses special IDENTITY columns
	//in the database to allow the database to automatically
	//assign an id to the object when its row is inserted
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="Last_NAME")
	private String lastName;
	
	@Column(name="IRS_OFFICE")
	private String irsOffice;
	
	@Column(name="ADDRESS")
	private String ADDRESS;
	
	@Column(name="ZIP_CODE")
	private Integer zipCode;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="COUNTRY")
	private String country;

	public String getCompanyName() {
		return companyName;
	}
	
	//Getters and setters start here
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

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

	public String getIrsOffice() {
		return irsOffice;
	}

	public void setIrsOffice(String irsOffice) {
		this.irsOffice = irsOffice;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
	
}
