package day24_arrays;

public class Cities {

	public static void main(String[] args) {
		
		String [] cities= {"Wahisngton D.C.","Kyiv","Annandale","Moscow","Istanbul","Baku", "Miami", "Silver Springs","McLean"};
		
		//System.out.println(cities.length);
		
		for (int i=0; i<cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}

	}
}
