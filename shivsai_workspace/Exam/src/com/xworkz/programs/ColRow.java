package com.xworkz.programs;



public class ColRow {

	public static void main(String[] args) {
		
		        String string = "I am shivsai";    
		         
		        String ref = "";    
		            
		        
		        for(int i = string.length()-1; i >= 0; i--){    
		            ref = ref + string.charAt(i);    
		        }    
		         
		     
		        System.out.println("Original string: " + string);    
		       
		        System.out.println("Reverse of given string: " + ref);    
		    }    
	


		
	}

