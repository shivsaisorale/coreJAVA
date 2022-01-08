package com.xworkz.dto;

import java.io.Serializable;

public class TrainDTO implements Serializable {
	private int id;
	private int trainNo;
	private String boarding;
	private String destination;
	private int seatNo;
	private int price;
	private String classType;
	private String name;

	public TrainDTO() {
		System.out.println("invoked no args const");
	}

	public TrainDTO(int id, int trainNo, String boarding, String destination, int seatNo, int price, String classType,
			String name) {
		super();
		this.id = id;
		this.trainNo = trainNo;
		this.boarding = boarding;
		this.destination = destination;
		this.seatNo = seatNo;
		this.price = price;
		this.classType = classType;
		this.name = name;
	}

	@Override
	public String toString() {
		return "TrainDTO [id=" + id + ", trainNo=" + trainNo + ", boarding=" + boarding + ", destination=" + destination
				+ ", seatNo=" + seatNo + ", price=" + price + ", classType=" + classType + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
