package day31_methods_03;

import java.util.Scanner;

public class Calculator {
	
	public static void add(double num1,double num2) {
		double result=num1+num2;
	System.out.println(result);
	}

	public static void substract(double num1,double num2) {
		double result=num1-num2;
		System.out.println(result);
}
	
	public static void multiply (double num1,double num2) {
		double result=num1*num2;
		System.out.println(result);
		
		}
	
	public static void divide (double num1,double num2) {
		double result=num1/num2;
		System.out.println(result);
		}
	
	public static void remainder (double num1,double num2) {
		double result=num1%num2;
		System.out.println(result);
		}
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter 2 numbers");
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		
		System.out.println("Select operation '+','-','*','/','%'");
		String operator=scan.next();
		
	  /*if(operator.equals("+")) {add(n1,n2);}
		if(operator.equals("-")) {substract(n1,n2);}
		if(operator.equals("*")) {multiply(n1,n2);}
		if(operator.equals("/")) {divide(n1,n2);}
		if(operator.equals("%")) {remainder(n1,n2);}*/
	
		switch (operator) {
		case "+":
			add(n1,n2);
			break;
		case "-":
			substract(n1,n2);
			break;
		case "*":
			multiply(n1,n2);
			break;
			
		case "/":
			divide(n1,n2);
			
			break;
		case "%":
			remainder(n1,n2);
			
			break;
			
			default:
				System.out.println("invalid operator");
		}
	}
	}
