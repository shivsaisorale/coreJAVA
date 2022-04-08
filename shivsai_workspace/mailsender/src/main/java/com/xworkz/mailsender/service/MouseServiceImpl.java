package com.xworkz.mailsender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MouseServiceImpl implements MouseService{

	@Autowired
	private MailSender mailSender;

	public MouseServiceImpl() {
		System.out.println(this.getClass().getSimpleName() +"Bean Created");
	}

	@Override
	public boolean sendMouseDataToRecipient(String username, String subject,String text) {
		System.out.println("Invoked sendMouseDataToRecipient() ");
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo("shivsai.xworkz@gmail.com");
		message.setSubject("Mouse data");
		message.setText(username + subject);
		mailSender.send(message);
		System.out.println("Mail sent successfully");

		return true;
	}

}

	

