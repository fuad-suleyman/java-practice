package day25_array_in_java;

import java.util.Arrays;

public class Population {
	public static void main(String[] args) {
		
		int [] population=new int [5];
		
		
		population[0]=5000;
		population[1]=10000;
		population[2]=15000;
		population[3]=8000;
		population[4]=22000;
		
		//int [] population={5000, 10000, 15000, 8000, 22000};
		
		String f=Arrays.toString(population);
		System.out.println(population[1]);
		
		int idx=0;
		//System.out.println("City o population: "+idx);
		
		String [] cities = {"Miami", "London", "Tokyo","Rome", "New York"};
		
		for (int i=0; i<cities.length; i++) {
			System.out.println("Population of "+cities[i]+" is "+population[i]+'.');
		}
		
		
	}

}
