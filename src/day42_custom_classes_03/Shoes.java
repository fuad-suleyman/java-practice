package day42_custom_classes_03;

public class Shoes {

	String brand;
	double size;
	
	public void setShoesData(String nBrand, double nSize) {
		brand=nBrand;
		size=nSize;
		
	}
	
	
	public String getShoesData(){
		
		return brand+" | "+size;
		
	}
}
