package com.xworkz.phonedirectory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.phonedirectory.dto.PhoneDirectoryDTO;
import com.xworkz.phonedirectory.entity.PhoneDirectoryEntity;
import com.xworkz.phonedirectory.service.PhoneDirecotryService;

@Component
@RequestMapping("/")
public class PhoneBean {
	@Autowired
	private PhoneDirecotryService direcotryService;

	public PhoneBean() {
		System.out.println("shooting on phonebean");
	}

	@RequestMapping("/call.do")
	public String savePhone(PhoneDirectoryDTO directoryDTO, Model model) {
		System.out.println("shooting on method");
		PhoneDirectoryEntity directoryEntity = new PhoneDirectoryEntity(directoryDTO.getName(),
				directoryDTO.getMobileNo(), directoryDTO.getAdress(), directoryDTO.getLandMark(),
				directoryDTO.getLandline(), directoryDTO.getCity(), directoryDTO.getPincode());
		boolean saved = direcotryService.validateAndsave(directoryEntity);
		if (saved) {
			System.out.println("Contact is saved and successfully" + directoryDTO.getName());
			model.addAttribute("message","Product is disply");
		} else {
			System.out.println("Contact is not saved " + directoryDTO.getName());
			model.addAttribute("message","Product is not disply");
		}
		return "/Phone.jsp";
	}

}
