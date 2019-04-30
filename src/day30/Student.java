package day30;

public class Student {
	public static void main(String[] args) {
		study("java  and ukjhv,hycl,f");
		sleep(3);
	}
	public static void study(String topic) {
		
		System.out.println("Student is studying "+topic);
	}
	
	
	
	
	public static void sleep(int hours) {
		
		System.out.println("Student has been sleeping for "+hours+" hours");
	}
}
