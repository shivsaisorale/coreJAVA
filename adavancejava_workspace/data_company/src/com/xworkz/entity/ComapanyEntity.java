package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")

public class ComapanyEntity {

	@Id
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_domain")
	private String domain;
	@Column(name = "c_website")
	private String website;

	public ComapanyEntity() {
		// TODO Auto-generated constructor stub
	}

	public ComapanyEntity(int id, String name, String domain, String website) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.website = website;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "ComapanyEntity [id=" + id + ", name=" + name + ", type=" + ", domain=" + domain + ", website="
				+ website + ", getId()=" + getId() + ", getName()=" + getName() + ", getType()=" 
				+ ", getDomain()=" + getDomain() + ", getWebsite()=" + getWebsite() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComapanyEntity other = (ComapanyEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
