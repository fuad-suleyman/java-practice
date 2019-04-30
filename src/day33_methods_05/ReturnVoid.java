package day33_methods_05;

public class ReturnVoid {

	
	public static void sumVoid(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("Sum: "+sum);
	}
	
	public static int add (int num1, int num2) {
		int sum = num1+num2;
		return sum;
		
	}
	public static double multiply(double num1 ,double num2) {
		double mult=num1*num2;
		return mult;
	}
	
	public static double divide(double num1 ,double num2) {
		System.out.println();
		double mult=num1/num2;
		return mult;
	}
	
	public static double minus (double num1 ,double num2) {
		double mult=num1-num2;
		return mult;
	}
	
	public static void main(String[] args) {
		sumVoid(10,20);
		int result=add(5,8);
		double minus=minus(10,5);
		double divide=divide(10,5);
		double mult=multiply(10,5);
		System.out.println(minus+" "+divide+" "+mult);
	}
	
}
