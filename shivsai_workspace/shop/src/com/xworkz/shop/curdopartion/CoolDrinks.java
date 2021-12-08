package com.xworkz.shop.curdopartion;

public class CoolDrinks {
	
	private String drinkType;
	private String[] coolDrinkNames=new String[7];
	private int king=0;
	
	public CoolDrinks() {
		
	}
	
	public CoolDrinks(String drinkType) {
		this.drinkType=drinkType;
		
	}
    public String getDrinkType() {
    	return drinkType;
    }
public void addCoolDrinkNames(String name) {
	if(this.king<this.coolDrinkNames.length) {
		this.coolDrinkNames[this.king]=name;
		this.king++;
		System.out.println("invoked the add Method,ver added:".concat(name));
		
	}else {
		System.err.println("Error the array is full cant add");
	}
}
	public String[] getCoolDrinkNames() {
		return this.coolDrinkNames;
	}
public void delete(int no) {
	if(no >= 0 && no < coolDrinkNames.length) {
		this.coolDrinkNames[no] =null;
		System.err.println("Error :cant be deleted");
		
	}
}

}

