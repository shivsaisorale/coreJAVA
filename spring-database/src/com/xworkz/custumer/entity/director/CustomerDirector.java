package com.xworkz.custumer.entity.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.custumer.entity.CustomerEntity;

public class CustomerDirector {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml") ;
		
		CustomerEntity entity=new CustomerEntity(4,"shivsai","bidar123","kiran@gmail.com",8139966651d,"true",24);	
		CustomerService service=context.getBean(CustomerService.class);
		service.validateandsave(entity);
	}
	
	
	
	
	
}
