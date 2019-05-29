package day52_inheritance_05;

import java.util.*;

public class FinalList {

	public static void main(String[] args) {
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("Black");
		System.out.println(COLORS.toString());
		
		
	//	COLORS=new ArrayList<>();			>> if ArrayList is final we cannot creat new object											
		System.out.println(COLORS.toString());	
	}

}
