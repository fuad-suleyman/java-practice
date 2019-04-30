package day28;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFood {
	
	public static void main(String[] args) throws IOException {
		
		// read all data and assign to array
		String data []=Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: "+data.length );
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		
		int counter=0;
		for(String food : data ) {
			System.out.println("#"+counter+"=>"+food);
			counter++;
		}
		int counter2=0;
		for(int i=0; i<data.length;  i++) {
			if(data[i].contains(",VA,")) {
				counter2++;
			}
		}
		System.out.println(counter2);
	}

}
