package com.xworkz.adress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Component
public abstract class Abstrct0Address {

	@Value("rajajinagar")
	protected String street;
	@Value("301")
	protected int doorNo;
	@Value("Benagluru")
	protected String city;

	public abstract void setStreet(String street);

	public abstract void setDoorNo(int doorNo);

	public abstract void setCity(String city);

}
