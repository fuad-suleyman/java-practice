package day29;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {

		String[][] countries = { { "USA", "Washington D.C" }, { "Canada", "Ottowa" }, { "Mexico", "Mexico City" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Buenos Aires" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhistan", "Nursultan" }, };

		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i][0] + ", ");
		}
		System.out.println("\n**********************************");
		int j = 0;
		while (j < countries.length) {
			System.out.print(countries[j][0] + ", ");
			j++;
		}
		System.out.println("\n**********************************");

		for (String[] cntr : countries) {
			System.out.print(cntr[0] + ", ");
		}

		System.out.println("\n**********************************");

		int nums = 0;
		String cities = "";

		while (nums < 8) {

			cities += countries[nums][1] + ", ";
			nums++;

		}

		String[] citiesAr = cities.split(", ");

		System.out.println(Arrays.toString(citiesAr));
		
	
		for (int row=0; row<countries.length; row++) {
			
			if(countries[row][0].equals("Bolivi")) {
				
				//System.out.println(countries[row][1]);
				if(countries[row][1].equals("La Paz")) {
					
				
					System.out.println("Test passed");
				}
				
				  else {
						  System.out.println("Test failed");
					    }break ;
			}
			
			
		}
		
	}

}
