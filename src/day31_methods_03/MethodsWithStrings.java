package day31_methods_03;

import java.util.Arrays;

public class MethodsWithStrings {
	
	public static void countWords(String sentence) {
		String str [] = sentence.split(" ");
		System.out.println(Arrays.toString(str));
	}

	
	
	
	public static void googleSearchResults(String search) {
		String [] words= search.split(" ");
		String word1=words[1].replace(",", "");
		
		String word2 = words[3].substring(words[3].indexOf("(")+1,words[3].length());
		
		System.out.println("Result count: "+word1);
		System.out.println("Time in seconds: "+word2);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResults("About 16,600,000 results (0.73 seconds)");
	}
}
