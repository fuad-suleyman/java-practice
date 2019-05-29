package day47_blocks;

import java.time.LocalDateTime;

public class BriteERP {
	
	static{
		System.out.println("Lounge Browser");
		
		System.out.println("Navigate to: "+TestData.url);
		
	}
	
	public static void enterEmail() {
		System.out.println("Eneter email: "+TestData.email);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected name: "+TestData.username);
		System.out.println("Actual Name Displayed: Viktoria Lugovska");
		System.out.println("Login Successful - " + LocalDateTime.now());

	}
	
	public static void enterPass() {
        System.out.println("Enter password: " + TestData.password);
    }

}
