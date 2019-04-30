package day34_methods_06;

import java.util.Arrays;

public class VarArgs {
	
	public static void main(String  args) {
		printWord("red","blue","white","yellow");
		
System.out.println(sum(1,2,5,10,78));

if(sum(1,2,3,58,55)<=200) {System.out.println("Within budget");}else
	if(sum(1,2,3,58,55)>200) {System.out.println("Broke");}

cook("Bowl","Rice","Chicken","Salad","Cheese","Sour cream");

	
	}
	
	
	
	public static void printWord(String... words) {

		//handle it like an Array
		
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public static int sum(int...  count ) {
		
		int total=0;
		/*for(int nums:count) {
			total+=nums;
		}*/
		
		for (int i=0; i<count.length; i++) {
		total+=count[i];
		}
		return total;
	}
	
	public static void cook(String name, String...ings) {
		System.out.print("Food: "+name+" ");
		System.out.println(Arrays.toString(ings));
	}
	
}
