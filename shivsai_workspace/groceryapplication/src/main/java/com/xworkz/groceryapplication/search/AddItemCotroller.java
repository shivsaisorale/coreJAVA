package com.xworkz.groceryapplication.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.groceryapplication.dto.GroceryDTO;
import com.xworkz.groceryapplication.entity.GroceryEntity;
import com.xworkz.groceryapplication.service.GroceryService;

@Controller
@RequestMapping("/")
public class AddItemCotroller {
	@Autowired
	private GroceryService groceryService;

	public AddItemCotroller() {
		System.out.println(" shotting on additemcotroller ");
	}

	@RequestMapping("addItemResult.do")
	public String onGroceriesSaveResult(GroceryDTO groceriesDTO, Model model) {
		System.out.println("invoked Grocery AddItem method");
		System.out.println(groceriesDTO);
		GroceryEntity entity = new GroceryEntity(groceriesDTO.getName(), groceriesDTO.getQuantity(),
				groceriesDTO.getPrice(), groceriesDTO.getType(), groceriesDTO.getBrand());
		boolean saved = groceryService.validateAndsave(entity);
		if (saved) {
			System.out.println("Groceries was added" + groceriesDTO.getName());
			int total = (int) (groceriesDTO.getQuantity() * groceriesDTO.getPrice());
			model.addAttribute("messageTotalPrice", "Total :" + total);
			model.addAttribute("message", "Groceries are saved successfully");
		} else {
			System.out.println("Groceries added" + groceriesDTO.getName());
			model.addAttribute("message", "Groceries are not saved");
		}
		return "/AddItemResult.jsp";
	}

}
