package com.kce.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="User Name")
	private String unmae;
	 
	@Column(name="Password")
	private String pass;
	
	@Column(name="Mail Id")
	private String mail;
	
	@Column(name="Mobile")
	private String mobile;

	public String getUnmae() {
		return unmae;
	}

	public void setUnmae(String unmae) {
		this.unmae = unmae;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
