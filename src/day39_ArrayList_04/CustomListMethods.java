package day39_ArrayList_04;
import java.util.*;
public class CustomListMethods {

	

	public static void main(String[] args) {
		
		List<Double> nums = new ArrayList<>();
        nums.add(44.2);
        nums.add(11.3);
        nums.add(22.2);
        nums.add(55.1);
        nums.add(66.4);
        
       System.out.println(sumList(nums));

       System.out.println(getList(10));
		
       System.out.println(getRandom(5));
       
       ArrayList<String>numbers=new ArrayList<>();
       numbers.add("1");
       numbers.add("2");
       numbers.add("3");
       numbers.add("4");
       numbers.add("5");
       System.out.println(converToIntList(numbers));
	}
	
	public static void printList(List<Integer> nums) {
		
		for(Integer i: nums) {
			System.out.print(i+" ");
		}
		 
		
		
	}
	
	public static double sumList(List<Double>as) {
		double sum=0;
		for(Double num: as) {
			sum+=num;
		}
		
		return sum;
		
	}
	
	public static ArrayList<Integer> getList(int num) {
		ArrayList<Integer>counts=new ArrayList<>();
		
	  /*for(int i=1; i<=num; i++) {
			counts.add(i);
		}*/
		
		int counter=1;
		
		while(counter<=num) {
			counts.add(counter);
			counter++;
		}
		
		return counts;
		
	}
	
	public static ArrayList<Integer>getRandom(int num){
		Random r=new Random();
		ArrayList <Integer>random=new ArrayList<>();
		for (int i=0; i<num; i++) {
			
			random.add(r.nextInt(101));
		}
		return random;
	}
	
	/** convertToIntList
   Return type: List<Integer>
   Param: List<String>
   It will take each string and convert to Integer and return as Integer list
   List<String> strL = new ArrayList<>();
   strL.add("56");
   strL.add("99");
   convertToIntList(strL); => [56, 99] */
	
	public static List<Integer>converToIntList(ArrayList<String>nums){
		ArrayList<Integer>ints=new ArrayList<>();
		
		for(int i=0; i<nums.size(); i++) {
			ints.add(Integer.parseInt(nums.get(i)));
		}
		return ints;
	}
}
