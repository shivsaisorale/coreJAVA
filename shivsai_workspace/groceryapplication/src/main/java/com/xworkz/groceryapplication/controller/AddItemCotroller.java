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
public class AddItemCotroller {
	@Autowired
	private GroceryService service;

	public AddItemCotroller() {
		System.out.println("shooting on bean");
	}

	@RequestMapping("/addItem.do")
	public String saveGrocery(GroceryDTO groceryDTO, Model model) {
		System.out.println("shooting on method");
		System.out.println(groceryDTO);

		GroceryEntity entity = new GroceryEntity(groceryDTO.getName(), groceryDTO.getQuantity(), groceryDTO.getPrice(),
				groceryDTO.getType(), groceryDTO.getBrand());
		boolean saved = service.validateAndsave(entity);
		if (saved) {
			System.out.println("Contact is saved and successfully" + groceryDTO.getName());
			int total = (int) (groceryDTO.getQuantity() * groceryDTO.getPrice());
			model.addAttribute("messageTotalPrice", total);
			model.addAttribute("message", "Grocery is save");
			model.addAttribute("grocery", groceryDTO);

		} else {
			System.out.println("Contact is not saved " + groceryDTO.getName());
			model.addAttribute("message", "Grocery is not save");
		}
		return "/AddItemResult.jsp";

	}
}