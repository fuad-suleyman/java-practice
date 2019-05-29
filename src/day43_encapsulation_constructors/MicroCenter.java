package day43_encapsulation_constructors;

public class MicroCenter {
	
public static void main(String[] args) {
	Computer comp1=new Computer();
	Computer comp2=new Computer();
	
	//System.out.println(comp1.toString());
	comp1.setBrand("iMac");
	comp1.setOs("macOS High Sierra");
	comp1.setPrice(2500.0);
	System.out.println(comp1.toString());
	
	
	
	Computer comp3=new Computer("ASUS","Widows 7",  645.5);
	comp3.setOs("Windows 11");
	System.out.println(comp3);
	
	comp3.setPrice(1000);
	System.out.println(comp3);
	
}

}
