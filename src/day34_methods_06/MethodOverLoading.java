package day34_methods_06;

public class MethodOverLoading {
	
	public static void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Result: "+ result);
		
	}

	public static void add(double num1,double num2) {
		double result = num1+num2;
		System.out.println("Result: "+ result);
		
	}
	
	public static void add(long num1,long num2) {
		long result = num1+num2;
		System.out.println("Result: "+ result);
		
	}
}
