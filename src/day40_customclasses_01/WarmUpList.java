package day40_customclasses_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUpList {
	
	public static int countOccurances(List<String> str, String word) {
		int count=0;
		for(String w:str) {
			if(w.equals(word)) {count++;}
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		List<String>str=new ArrayList<>();
		str=Arrays.asList("java","selenium","java","cucumber","c++");
		
		System.out.println(countOccurances(str, "java"));
	}

}
