package day20_forLoop;

public class PrintEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="Wooden Spoon";
		int length=word.length();
		
		for(int i=0; i<length; i++) {
			
			System.out.print(word.charAt(i)+",");
		}
		System.out.println( );
		for(int i=0; i<length; i++) {
			char letter=word.toLowerCase().charAt(i);
		if(letter=='a'||letter=='i'||letter=='e'||letter=='o'||letter=='u')	{System.out.print(letter+",");}
		}

	}

}
