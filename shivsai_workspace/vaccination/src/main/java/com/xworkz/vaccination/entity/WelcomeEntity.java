package com.xworkz.vaccination.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="welcome")
public class WelcomeEntity {

	@Id
	@Column(name="USERID")
	private int userid;
	@Column(name="EMAIL")
	private String email;
	@Column(name="OTP")
	private int otp;
	
	public WelcomeEntity(int userid, String email, int otp) {
		super();
		this.userid = userid;
		this.email = email;
		this.otp = otp;
	}
	

}
