package day21;

import java.util.Scanner;

public class Uniqe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter word");
		Scanner scan= new Scanner(System.in);
		
		String word=scan.next();
		String unique="";
		
		

		int size=word.length();
		int a=0;
		for(a=0; a<size; a++ ) {
			if(!unique.contains(""+word.charAt(a)))
			unique+=word.charAt(a);
			
		}
		System.out.println(unique);

	}

}
