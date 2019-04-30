package day24_arrays;

public class CheckFirstAndLast {
	public static void main(String[] args) {
	
		int[] numbers= {12,41,213,21,42,120,15};
		
		System.out.println(numbers[0]==numbers[numbers.length-1]);
		// .length<<<<is not a method , it is an instance variable(property)
		System.out.println(numbers.length);
		
		
		
	}
	
	

}
