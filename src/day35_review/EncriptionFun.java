package day35_review;

public class EncriptionFun {
	
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word="easter";
		
		String encword="";
		
		for(int i=0; i<word.length(); i++) {
			char first=word.charAt(i);
			int position=alphabet.indexOf(first);
			encword+=encrypted.charAt(position);
		}
		System.out.println(encword);
		
		char a='a';
		
		System.out.println(encryptChar(a));
		System.out.println(encreyptWord(word));
		
		System.out.println(encryptSentence("java is fun"));
		System.out.println(encryptSentence("i love java"));
		

	}

	
	public static char encryptChar(char a) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		int pos=alphabet.indexOf(a);
		char b=encrypted.charAt(pos);
		
		return b;
		
	}
	
	
	public static String encreyptWord(String word) {
		

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		String encword="";
		for(int i=0; i<word.length(); i++) {
			char first=word.charAt(i);
			int position=alphabet.indexOf(first);
			encword+=encrypted.charAt(position);
		}
		return encword;
	}
	
	
	public static String encryptSentence(String sentence) {
		String wordsArr []=sentence.toLowerCase().split(" ");
		String retValue="";
		for(int i=0; i<wordsArr.length; i++ ) {
			retValue+=encreyptWord(wordsArr[i]);
		}
		return retValue;
	}
	
	
}
