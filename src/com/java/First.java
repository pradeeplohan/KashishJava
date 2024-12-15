package com.java;

public class First {

	
	int i=5;  
	char c ='7';
	
	
	public static void main(String[] args) {

		//class object
		First obj = new First();
		obj.run();
		obj.talk();
		obj.walk();
		obj.watchreels();
		
		
		Second s  = new Second();
		s.display();
		
	}

	
	
	
	
	
	
	public void watchreels() {
		System.out.println(i);
		System.out.println("person is wathing reels");
	}
	

	public void run() {
		System.out.println("person is running");
	}
	
	

	public void walk() {
		System.out.println("person is walking");
	}
	
	

	public void talk() {
		System.out.println("person is talking");
	}
	
	
	
}
