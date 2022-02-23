package com.xworkz.customer.dao.stater;

import java.time.LocalDateTime;

import com.xworkz.customer.CustomerDTO;
import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dao.CustomerDAOImpl;

public class CustomerDirector {

	CustomerDTO customerDTO=new  CustomerDTO(1,"shivsai",301,23,"bidar","String",LocalDateTime.now(),"update",LocalDateTime.now());

	CustomerDAO customerDAO=new CustomerDAOImpl(null);
	customerDAO.save(customerDTO);
	

}
