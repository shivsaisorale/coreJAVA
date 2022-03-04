package com.xworkz.groceryapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.groceryapplication.dto.GroceryDTO;
import com.xworkz.groceryapplication.entity.GroceryEntity;
import com.xworkz.groceryapplication.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryBean {
	@Autowired
	private GroceryService service;

	public GroceryBean() {
		System.out.println("shooting on bean");
	}

	@RequestMapping("/grocery.do")
	public String saveGrocery(GroceryDTO groceryDTO, Model model) {
		System.out.println("shooting on method");
		System.out.println(groceryDTO);

		GroceryEntity entity = new GroceryEntity(groceryDTO.getName(), groceryDTO.getQuantity(), groceryDTO.getPrice(),
				groceryDTO.getType(), groceryDTO.getBrand());
		boolean saved = service.validateAndsave(entity);
		if (saved) {
			System.out.println("Contact is saved and successfully" + groceryDTO.getName());
			model.addAttribute("message", "Grocery is save");
		} else {
			System.out.println("Contact is not saved " + groceryDTO.getName());
			model.addAttribute("message", "Grocery is save");
		}
		return "/AddItem.jsp";
		
	}
}