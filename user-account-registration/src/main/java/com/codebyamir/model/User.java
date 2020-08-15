package com.codebyamir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, unique = true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;

	@Transient
	private String password;

	@NotEmpty(message = "Please provide your name")
	private String name;

	@NotEmpty(message = "Please provide your name in Bengali")
	private String nameBangla;

	@NotEmpty(message = "Please Enter your occupation")
	private String occupation;

	@NotEmpty(message = "Please Enter your Pay Scale")
	private String payscale;

	@NotEmpty(message = "Please Enter Current Work Place")
	private String currentWorkplace;

	@NotEmpty(message = "Please Enter Current Work Place")
	private String fatherName;

	@NotEmpty(message = "Please Enter Current Work Place")
	private String motherName;

	public String getFatherName() {
		return fatherName;
	}



	@NotEmpty(message = "Please Enter Current Work Place")
	private String presentAddress;

	private boolean enabled;

	private String confirmationToken;

	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean value) {
		this.enabled = value;
	}


	public String getNameBangla() {
		return nameBangla;
	}

	public void setNameBangla(String nameBangla) {
		this.nameBangla = nameBangla;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPayscale() {
		return payscale;
	}

	public void setPayscale(String payscale) {
		this.payscale = payscale;
	}

	public String getCurrentWorkplace() {
		return currentWorkplace;
	}

	public void setCurrentWorkplace(String currentWorkplace) {
		this.currentWorkplace = currentWorkplace;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

}