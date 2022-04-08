package com.xworkz.mailsender.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Emaildto {

	private String username;
	private String subject;
	private String text;
	
}
