package day46_static_keyword;

public class CampusRunner {

	public static void main(String[] args) {
		
		Campus camp1=new Campus("McLean");
		Campus camp2=new Campus("Chicago");
		Campus camp3=new Campus("New Jersey");
		Campus camp4=new Campus("McLean");
		System.out.println(camp1.country);
		Campus.cityInfo();
		System.out.println(camp1.country);
		
	}
}
