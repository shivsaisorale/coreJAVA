package com.xworkz.groceryapplication.search;

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
public class GrocerySearchController {

	@Autowired
	private GroceryService service;

	public GrocerySearchController() {
		System.out.println("shooting on controller");
	}

	@RequestMapping("search.do")
	public String onSearch(@RequestParam String name,Model model) {
		model.addAttribute("grocery","name");
		GroceryDTO dto = this.service.validateAndfindByName(name);
		return "/GrocerySearch.jsp";

	}
}
