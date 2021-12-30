package com.xworkz.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {

	private int id;
	private String name;
	private int code;
	private String capital;

	public StateDTO() {
		System.out.println("invoked no args const");
	}

	public StateDTO(int id, String name, int code, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "StateDTO [id=" + id + ", name=" + name + ", code=" + code + ", capital=" + capital + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
