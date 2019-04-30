package day28;import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {
		
		String [][] teams= new String[2][6];
		//MultiD array
		
		teams [0] [0]="Irina";
		teams [0] [1]="Zarif";
		teams [0] [2]="Cihan";
		teams [0] [3]="Habib";
		teams [0] [4]="Adel";
		teams [0] [5]="Bojan";
		
		teams [1] [0]="Olimjon";
		teams [1] [1]="Mirshod";
		teams [1] [2]="Usman";
		teams [1] [3]="Nursultan";
		teams [1] [4]="Roman";
		teams [1] [5]="Dmitriy";
		
		System.out.println(Arrays.deepToString(teams));
		System.out.println("Number of people in first team: "+teams[0].length);
		System.out.println("Number of people in second team: "+teams[1].length);
		
		System.out.println("******************************************");
		
		int numbers[][] = new int [3][4];
		
		numbers[0][0]=1000;
		numbers[0][1]=1200;
		numbers[0][2]=3000;
		numbers[0][3]=5879;
		
		numbers[1][0]=1258;
		numbers[1][1]=8990;
		numbers[1][2]=6978;
		numbers[1][3]=2579;
		
		numbers[2][0]=8485;
		numbers[2][1]=399;
		numbers[2][2]=21288;
		numbers[2][3]=978744;
		
		System.out.println("How many rows: "+numbers.length);
		System.out.println("How many numbers in first row: "+numbers[0].length);
		System.out.println("How many numbers in second row: "+numbers[1].length);
		System.out.println("How many numbers in third row: "+numbers[2].length);
		System.out.println("******************************************");
		System.out.println(Arrays.deepToString(numbers));
		
		System.out.println("******************************************");
		
		int [] [] scores= {{3,5,10},{6,4,2,10}};
		
		System.out.println("Days played/Number of arrays: "+scores.length);
		System.out.println("Number of values in: "+scores[0].length);
		System.out.println("Number of values in: "+scores[1].length);
		
		
		System.out.println("*******************************************");
		
		int[][] values = new int[4][];
		values[0] = new int[]{34,23,5};
		values[1] = new int[]{34,45,6,5,34,2,2,43,45,56,567,3};
		
		values[2] = new int[2];//55, 88
		values[2][0] = 55; 
		values[2][1] = 88;
		
		values[3] = new int[]{5,12,45,77,34};
		
		System.out.println(Arrays.deepToString(values));
		
	}
}
