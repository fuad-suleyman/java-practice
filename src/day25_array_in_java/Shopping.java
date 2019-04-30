package day25_array_in_java;

public class Shopping {
	 
	public static void main(String[] args) {
		
		String [] products = {"Timberland shoes", "H&M Shirt", "Swatch Watch","Gucci Bag", "Adidas Socks"};
		
		double [] prices= {120, 5.99, 10.50, 3000.5, 6.99};
		
		int [] itemId= {12345,12346,12347,12348,12349};
		
		
		if (products.length==itemId.length&& itemId.length==prices.length) {
			System.out.println("Shopping list looks good");
		}else {System.out.println("Somthing is wrong in this list");}
		
		for (String product : products) /**/
		{
			System.out.println(product);
		}
		System.out.println("**************************");
	
	System.out.println("**************************");
	
	//itemsId print this in reverse order using a loop
	for(int i=itemId.length-1; i>=0; i-- )
		
	{
		System.out.println(itemId[i]);
	}
	
	
	System.out.println("######## YOUR SHOPPING RECEIPT ########");
	double total=0;
	
	for	(int i=0; i<products.length; i++)
	{
	System.out.println("   Item"+(i+1)+" - " +products[i]+" - $"+prices[i]);
	
	total+=prices[i];
	}
	System.out.println("   Total price is $"+total);
	
	System.out.println("**************************");
	
	int maxIndex=0;
	double maxPrice=0;
	
	int minIndex=0;
	for (int j=0;  j<prices.length; j++) {
		if (prices[j]>maxPrice) {
			maxPrice=prices[j];
			maxIndex=j;
		}
	}
	System.out.println("The most expensive item is "+products[maxIndex]+" $"+maxPrice);
	
	
	//THIS IS THE SOLUTION HOW TO FIND MINIMUM PRICE; 
	
	double minPrice=maxPrice;
	
	for (int z=0; z<prices.length; z++) 
	{
		if (prices[z]<minPrice) {
			minPrice=prices[z]; //>> each time (looping) minPrice changes its value to the lower value;
			minIndex=z;
		}
	
	}
	System.out.println("The cheapest item is "+products[minIndex]+" $"+minPrice);
	}
}
