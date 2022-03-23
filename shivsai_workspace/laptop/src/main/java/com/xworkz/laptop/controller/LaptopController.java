package com.xworkz.laptop.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.laptop.dto.LaptopDTO;

@Component
@RequestMapping("/")
public class LaptopController {

	@RequestMapping("/abc")
	public String firstRequest() {
		System.out.println("Invoked firstRequest");
		return "/WEB-INF/WhatsAppImage.jpeg";
		
	}
	
	@RequestMapping("/laptop")
	public String onSubmitButtonClicked(@ModelAttribute LaptopDTO dto) {
		System.out.println("Invoked onSubmitButtonClicked");
		String laptopName=dto.getLaptopName();
		
		return "/WEB-INF/laptop.html";
		
	}
}
