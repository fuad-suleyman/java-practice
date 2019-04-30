package day35_review;

import java.util.Arrays;

public class UniqueNumbers {
	
	
	
	public static String [] unique(int [] myArr) {
		
		
		
		String uniquenum="";
		for(int i=0; i<myArr.length; i++) {
			boolean unique=true;
			for(int j=0; j<myArr.length; j++) {
				if (myArr[i]==myArr[j]&&i!=j) {
					unique=false;
				}
			}
			if(unique==true) {uniquenum+=myArr[i]+" ";}
		}
		
		String [] uniqueArr=uniquenum.split(" ");
		return uniqueArr;
		
		
	}
	
	
	
	
public static void main(String[] args) {
	int [] myArr= {7,4,1,4,4,1,5,9,9,3};
	System.out.println(Arrays.deepToString(unique(myArr)));
			
}
}
