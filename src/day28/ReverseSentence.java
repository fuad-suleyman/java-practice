package day28;
import java.util.*;
public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String sentence="Write a program that will print the shortest word in the given array str  ";
		
		String str [] = sentence.split(" ");
		
		String temp="";
		
		for (int i=str.length-1; i>=0; i--)
		{
			
			System.out.print(str[i]+" ");
			
			
		}
		
	}

}
