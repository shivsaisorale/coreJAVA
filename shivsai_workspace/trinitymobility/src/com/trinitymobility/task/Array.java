package com.trinitymobility.task;

import java.util.Arrays;

public class Array {

	  
	    public static void main(String[] args)
	    {    
	        int[] arr = new int[5];
	        int counter = 0;
	        for(int i = 0; i <= 6; i++)
	        {
	            if(counter == arr.length)
	            {
	                int[] newArr = Arrays.copyOf(arr, arr.length + 1);
	                arr = newArr;
	            }
	            arr[i] = i*2;
	            counter += 1;
	        }
	        for(int i=0; i<arr.length; i++)
	        {
	            System.out.print(arr[i]+" ");
	        }

	    }
}
