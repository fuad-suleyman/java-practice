package day24_arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		
		char [] values= {'a','b','c'};
		
		for (char value:values) {
			System.out.println(value);
		}
		
		String str="wooden spoon";
		
		char[] chars=str.toCharArray();
		
		for(char c: chars) {
			if(c=='o') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		/*String s="08:15:45AM";
		String word1=s.replace(s.substring(s.length()-2),"");
		String word2[] = word1.split(":");
		int [] timenums = new int [3]; 
		int i=0;
		for(String nums:word2) {
			int z=Integer.parseInt(nums);
			timenums[i]=z;
			i++;
		}
		
		
		
		if(s.contains("PM")&&timenums[0]<12) {
			System.out.println(timenums[0]+12+":"+timenums[1]+":"+timenums[2]);
		}else {System.out.println(timenums[0]+":"+timenums[1]+":"+timenums[2]);}*/
		
		/*str="";
		System.out.println();
		for (int i=chars.length-1; i>=0; i--) {
			if(chars[i]=='o') {}
			str+=chars[i];
		}
		System.out.print(str);*/
		
		//print characters with help of array of characters one by one if character is equals
		
	}

}
