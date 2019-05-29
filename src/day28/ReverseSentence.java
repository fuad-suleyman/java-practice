package day28;

import java.util.*;

public class ReverseSentence {

	public static void main(String[] args) {

		String sentence = "Write a program that will print the shortest word in the given array str  ";

		String s1tr[] = sentence.split(" ");

		String temp = "";

		for (int i = s1tr.length - 1; i >= 0; i--) {

			System.out.print(s1tr[i] + " ");

		}
System.out.println();
		String str = "abxxxcd";
		String result = "";
		  for (int i=0; i<str.length(); i++) {
		    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
		      result = result + str.substring(i, i+1); 
		    }
		  }
		System.out.println(result);
		
		  List<Integer>nums=new ArrayList<>();
		  nums=Arrays.asList(1,2,4,5,8,9);
		  if(nums.contains(1)) {int a=5+6;}
	}

}
