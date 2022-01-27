package com.xworkz.vendor.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
@Table(name="vendor")
public class VendorEntity {

	@Id
	@Column(name="v_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	int vid;
	@Column(name="v_name")
	private	String name;
	@Column(name="v_email")
	private	String email;
	@Column(name="v_loginname")
	private	String loginname;
	@Column(name="v_password")
	private	String password;
	@Column(name="v_address")
	private	String address;
	@Column(name="v_gstno")
	private	String gstno;
	@Column(name="v_createdBy")
	private	String createdBy;
	@Column(name="v_createdAt")
	private	LocalDateTime createdAt;
	@Column(name="v_updatedBy")
	private	String updatedBy;
	@Column(name="v_updatedAt")
	private	LocalDateTime updatedAt;

	public VendorEntity(String name, String email, String loginname, String password, String address, String gstno,
			String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
		super();
		this.name = name;
		this.email = email;
		this.loginname = loginname;
		this.password = password;
		this.address = address;
		this.gstno = gstno;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}
	
	
	
}
