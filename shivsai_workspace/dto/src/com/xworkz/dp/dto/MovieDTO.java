package com.xworkz.dp.dto;

public class MovieDTO {
	
	private float correctTime;
	private String name;
	private String noOfMovie;
	private String Time;
	
	public MovieDTO() {
		System.out.println("no argument constructor");
	}

	public MovieDTO(float correctTime, String name, String noOfMovie, String time) {
		super();
		this.correctTime = correctTime;
		this.name = name;
		this.noOfMovie = noOfMovie;
		Time = time;
	}

	public float getCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(float correctTime) {
		this.correctTime = correctTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNoOfMovie() {
		return noOfMovie;
	}

	public void setNoOfMovie(String noOfMovie) {
		this.noOfMovie = noOfMovie;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

}
