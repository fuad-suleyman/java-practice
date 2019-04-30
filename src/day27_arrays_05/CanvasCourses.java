package day27_arrays_05;

import java.util.Scanner;

public class CanvasCourses {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		/*
147 -> Java programming
204 -> Mentoring sessions
149 -> SDLC
152 -> QA Testing
144 -> Team activity
143 -> Welcome Kit
--> split by "/" and get the last value from array
--> convert it to integer. Integer.parseInt(...) -> int value
--> switch statement and find the matching*/
		
		System.out.println("Enter url:");
		String url=scan.next();
		
		String [] array= url.split("/");
		
		int num=Integer.parseInt(array[array.length-1]);
		
		switch(num) {
		case 147: 
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
			default:
				System.out.println("Invalid url");
		}
	}

}
