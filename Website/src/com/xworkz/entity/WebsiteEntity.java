package com.xworkz.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class WebsiteEntity implements Serializable {

	private int wid;
	private String name;
	private String url;
	private int since;
	private String owner;
	private String domain;

}
