package com.xworkz.laptop.entity;

import lombok.Data;

@Data
public class LaptopEntity {

	private String laptopName;
	private double laptopPrice;
	private double laptopRAM;
	private String laptopBrand;
	private String laptopColor;
	private double laptopROM;
	private String laptopProcessor;

	public LaptopEntity() {
		System.out.println("invoked laptop");

	}

	public LaptopEntity(String laptopName, double laptopPrice, double laptopRAM, String laptopBrand, String laptopColor,
			double laptopROM, String laptopProcessor) {
		super();
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
		this.laptopRAM = laptopRAM;
		this.laptopBrand = laptopBrand;
		this.laptopColor = laptopColor;
		this.laptopROM = laptopROM;
		this.laptopProcessor = laptopProcessor;
	}

	@Override
	public String toString() {
		return "LaptopEntity [laptopName=" + laptopName + ", laptopPrice=" + laptopPrice + ", laptopRAM=" + laptopRAM
				+ ", laptopBrand=" + laptopBrand + ", laptopColor=" + laptopColor + ", laptopROM=" + laptopROM
				+ ", laptop=" + ", laptopProcessor=" + laptopProcessor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LaptopEntity other = (LaptopEntity) obj;
		if (laptopBrand == null) {
			if (other.laptopBrand != null)
				return false;
		} else if (!laptopBrand.equals(other.laptopBrand))
			return false;
		if (laptopColor == null) {
			if (other.laptopColor != null)
				return false;
		} else if (!laptopColor.equals(other.laptopColor))
			return false;
		if (laptopName == null) {
			if (other.laptopName != null)
				return false;
		} else if (!laptopName.equals(other.laptopName))
			return false;
		if (Double.doubleToLongBits(laptopPrice) != Double.doubleToLongBits(other.laptopPrice))
			return false;
		if (laptopProcessor == null) {
			if (other.laptopProcessor != null)
				return false;
		} else if (!laptopProcessor.equals(other.laptopProcessor))
			return false;
		if (Double.doubleToLongBits(laptopRAM) != Double.doubleToLongBits(other.laptopRAM))
			return false;
		if (Double.doubleToLongBits(laptopROM) != Double.doubleToLongBits(other.laptopROM))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((laptopBrand == null) ? 0 : laptopBrand.hashCode());
		result = prime * result + ((laptopColor == null) ? 0 : laptopColor.hashCode());
		result = prime * result + ((laptopName == null) ? 0 : laptopName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(laptopPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((laptopProcessor == null) ? 0 : laptopProcessor.hashCode());
		temp = Double.doubleToLongBits(laptopRAM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(laptopROM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

}
