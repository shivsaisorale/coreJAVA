package com.xworkz.army.entity;


public class ArmyEntity {

private	String name;
private	String type;
private	int NoArmys;
private	long salary;
	
public ArmyEntity() {
	System.out.println("shotting on army");
	}

public ArmyEntity(String name, String type, int noArmys, long salary) {
	super();
	this.name = name;
	this.type = type;
	NoArmys = noArmys;
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getNoArmys() {
	return NoArmys;
}

public void setNoArmys(int noArmys) {
	NoArmys = noArmys;
}

public long getSalary() {
	return salary;
}

public void setSalary(long salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "ArmyEntity [name=" + name + ", type=" + type + ", NoArmys=" + NoArmys + ", salary=" + salary + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + NoArmys;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + (int) (salary ^ (salary >>> 32));
	result = prime * result + ((type == null) ? 0 : type.hashCode());
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
	ArmyEntity other = (ArmyEntity) obj;
	if (NoArmys != other.NoArmys)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (salary != other.salary)
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
}
	
	
}
