package com.trinitymobility.task;

interface Penwrite{
	void write();
}


interface Penplay {
	void  play();
}
interface Penpinch{
	void pinch();
}

public class MultiInheritence implements Penwrite, Penplay,Penpinch{

	@Override
	public void pinch() {
System.out.println("i will pinch");		
	}

	@Override
	public void play() {
		System.out.println("i will play with pen");			
	}


	@Override
	public void write() {
		System.out.println("i can write with pen");			
	}
	
}
