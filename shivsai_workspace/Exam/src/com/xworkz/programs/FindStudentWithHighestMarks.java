package com.xworkz.programs;

public class FindStudentWithHighestMarks {


	public static void main(String[] args) {

		Student mannu = new Student("Mannu", 72);
		Student satish = new Student("Satish", 88);
		Student Sreekant = new Student("Sreekant", 89);
		Student topper = getStudentWithHighestMarks("Mannu", "satish", "sreekant");

		System.out.println("The topper is " + topper.name);

	
	public static Student getStudentWithHighestMarks(Student s1,Student s2,Student s3) {
		  public int min(int [] array) {
		      int min = array[0];
		     
		      for(int i=0; i<array.length; i++ ) {
		         if(array[i]<min) {
		            min = array[i];
		         }
		      }
		      return min;
	}
	
	
}
