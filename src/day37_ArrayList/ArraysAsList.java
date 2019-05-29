package day37_ArrayList;
import java.util.*;
public class ArraysAsList {

	public static void main(String[] args) {
		
		List<String> cars=new ArrayList<>();
		cars.add("Honda");
		
		int arr [] = {1,2,3,45,8};
		List<Integer> num=new ArrayList<>();
		System.out.println("**********");
		
		num=Arrays.asList(1,2,4,87);
		System.out.println(num);
		 
		
		
		
		List <Double> prices=Arrays.asList(12.4,5.3,500.0,1230.5,5.99,12.0,9874.44,34.4,123.5,7.3);
		System.out.println(prices);
		double sum=0;
		for(double price:prices) {
			sum+=price;
		}
		System.out.println(sum);
		
		double total=0;
		for(int i=0; i<prices.size(); i++) {
			total+=prices.get(i);
		}
		System.out.println(total);
		
		
            String str =" Batch 11 ";
             int  z  =  str.trim().length();
           System.out.println( z );

	}
	
	
}
