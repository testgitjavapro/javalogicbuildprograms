package com.constructor;
//default constructor
public class Sample {
	private int id;
	private String name;
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
	 System.out.println("program start");
	 Sample s = new Sample();
	 s.display();
	 System.out.println("Program end");

	}

}
