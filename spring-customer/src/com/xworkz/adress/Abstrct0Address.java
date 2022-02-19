package com.xworkz.adress;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public abstract class Abstrct0Address implements Adress {
	@Value("rajajinagar")
	private String street;
	@Value("301")
	private String doorNo;
	@Value("Benagluru")
	private String city;

}
