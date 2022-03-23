package com.xworkz.laptop.dto;

import lombok.Data;

@Data
public class LaptopDTO {

	private String laptopName;
	private double laptopPrice;
	private double laptopRAM;
	private String laptopBrand;
	private String laptopColor;
	private double laptopROM;
	private String laptop;
	private String laptopProcessor;

	public LaptopDTO() {
		System.out.println("invoked laptop");

	}

	public LaptopDTO(String laptopName, double laptopPrice, double laptopRAM, String laptopBrand, String laptopColor,
			double laptopROM, String laptop, String laptopProcessor) {
		super();
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
		this.laptopRAM = laptopRAM;
		this.laptopBrand = laptopBrand;
		this.laptopColor = laptopColor;
		this.laptopROM = laptopROM;
		this.laptop = laptop;
		this.laptopProcessor = laptopProcessor;
	}
	
}
