package day26;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		
		String words= "java,cava,html,selenium";
		String [] wordsArray=words.split(",");
		
		System.out.println(Arrays.toString(wordsArray));
	}

}
