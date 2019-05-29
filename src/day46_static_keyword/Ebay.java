package day46_static_keyword;

public class Ebay {
	
	public static void main(String[] args) {
		Costumer cm1=new Costumer("Abdallah Aleies","AbdallahAleies@gmail.com");
		Costumer cm2=new Costumer("ADILET KYRGYZ","adiletkyrgyz@yahoo.com");
		Costumer cm3=new Costumer("Anatasia Zasibna","AnatasiaZasibna@outlook.com");

		System.out.println(cm2.count);
		cm1.count=10;
		System.out.println(cm2.count);
		
	}
	

}
