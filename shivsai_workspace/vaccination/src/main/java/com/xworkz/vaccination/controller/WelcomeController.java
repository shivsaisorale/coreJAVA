package com.xworkz.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import com.xworkz.vaccination.service.WelcomeService;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@Autowired
	private WelcomeService service;
	public WelcomeController() {
		System.out.println("create laptop controller :" + this.getClass().getSimpleName());
	}
	@RequestMapping("/welcome.do")
	public String  onGetOTPClicked(@RequestParam String email ,Model model) {
		boolean entity1 = this.service.validateEmail(email);
		service.getFourDigitOTP(4);

		
		if (email != null) {
			model.addAttribute("laptop", email);
			System.out.println(email.toString());
			model.addAttribute("message", "email is found");

		} else {
			model.addAttribute("message", "email is not found");
		}

		return "/WelcomePage.jsp";
				
				
		
	}

	
}