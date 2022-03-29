package com.xworkz.groceryapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.groceryapplication.dto.GroceryDTO;
import com.xworkz.groceryapplication.entity.GroceryEntity;
import com.xworkz.groceryapplication.service.GroceryService;

@Controller
@RequestMapping("/")
public class SearchController {

	@Autowired
	private GroceryService service;

	public SearchController() {
		System.out.println("shooting on GrocerySearchController");
	}

	@RequestMapping("/search.do")
	public String onSearch(@RequestParam String name, Model model) {
		System.out.println("shooting on onSearch method");

		GroceryDTO dto = this.service.validateAndfindByName(name);

		if (dto != null) {
			model.addAttribute("grocery", dto);
			System.out.println(dto.toString());
		} else {
			model.addAttribute("grocery", "grocery is not found");
		}
		return "/GrocerySearch.jsp";

	}
}
