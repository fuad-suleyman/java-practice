package day31_methods_03;
import java.util.*;
public class Authentication {
	
	public static void main(String[] args) {
	
		
		Scanner scan= new Scanner(System.in);
		String user= scan.next();
		String pass= scan.next();
		name(user,pass);
		
	}
	
public static void name(String username, String password) {
	
	if(username.equals("mentoring@cybertekschool.com")&&password.equals("mentor001")) {
		System.out.println("Login successful! Welcome to Okta");
	}else {
		System.out.println("Sign in failed");
	}
	
	
}
}
