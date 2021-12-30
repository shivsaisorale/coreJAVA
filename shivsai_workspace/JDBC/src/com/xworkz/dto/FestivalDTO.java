package com.xworkz.dto;

import java.io.Serializable;

public class FestivalDTO implements Serializable {

	private int id;
	private String name;
	private String date;
	private String state;

	public FestivalDTO() {
		System.out.println("invoked no args const");
	}

	public FestivalDTO(int id, String name, String date, String state) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.state = state;
	}

	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", date=" + date + ", state=" + state + "]";
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
