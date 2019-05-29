package day42_custom_classes_03;

import java.util.*;

public class DSWShoeStore {
	public static void main(String[] args) {

		
		Shoes shoes1 = new Shoes();
		shoes1.setShoesData("ALDO", 6.5);
		System.out.println(shoes1.getShoesData());
		
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("Allen Edmonds", 7.5);
			
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("BOSS HUGO BOSS", 9.0);
			
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		System.out.println();
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		
		//ArrayList of 
		
		ArrayList<Shoes>myShoes=new ArrayList<>();
		myShoes.add(shoesArray[0]);//or shoes1
		myShoes.add(shoesArray[1]);//or shoes3
		myShoes.add(shoesArray[2]);//or shoes3
		System.out.println();
		
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		
		System.out.println();
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		
		Shoes redShoes=myShoes.get(1);
		
		
		System.out.println(redShoes);
		System.out.println();
		
		for (Shoes shoess:myShoes) {
			if(shoess.size>7) {System.out.println(shoess.brand);}
		}
	}

}
