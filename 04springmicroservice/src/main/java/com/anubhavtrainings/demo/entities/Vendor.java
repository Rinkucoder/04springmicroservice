package com.anubhavtrainings.demo.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component

public class Vendor {
	
	@Setter
	@Getter
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Setter
	@Getter
	private String companyName;
	@Setter
	@Getter
	private String contactPerson;
	@Setter
	@Getter
	private String firstName;
	@Setter
	@Getter
	private String lastName;
	@Setter
	@Getter
	private String website;
	@Setter
	@Getter
	private String email;
	@Setter
	@Getter
	private String status;
	@Setter
	@Getter
	private Date regDate;
	public Vendor() {
		super();
		this.code = "VEND1";
		this.companyName = "IBM Incorporation";
		this.contactPerson = "Simon Smith";
		this.firstName = "Laura";
		this.lastName = "Simpson";
		this.website = "www.ibm.co.us";
		this.email = "laura@ibm.com";
		this.status = "A";
		this.regDate = new Date();
	}
	@Override
	public String toString() {
		return "Vendor [code=" + code + ", companyName=" + companyName + ", contactPerson=" + contactPerson
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", website=" + website + ", email=" + email
				+ ", status=" + status + ", regDate=" + regDate + "]";
	}

	
	
}
