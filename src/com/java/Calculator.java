package com.java;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator();
		int result = obj.calc(6, 3, '%');
		System.out.println(result);
		
		int result1 = obj.calc(6, 3,2, '-');
		System.out.println(result1);
		//polymorphism // method overloading
		
	}

	public int calc(int a , int b, char op) {
		switch(op) {
			case '+':
				return a+b;
			case '-':
				return a-b;
			case '*':
				return a*b;
			case '/':
				return a/b;
			default :
			   return -1;
		}
	}
	
	public int calc(int a , int b, int c, char op) {
		switch(op) {
			case '+':
				return a+b+c;
			case '-':
				return a-b+c;
			case '*':
				return a*b+c;
			case '/':
				return a/b+c;
			default :
			   return -1;
		}
	}
	
}
