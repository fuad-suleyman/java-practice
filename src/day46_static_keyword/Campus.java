package day46_static_keyword;

public class Campus {

	private	String city;
	static String country;
	
	static {
		System.out.println("Static Block-1");
		country="USA";
	}
	
	static {
		System.out.println("Static Block-2");
		country="Canada";
	}
	
	public Campus(String city) {
		System.out.println("Constructor...");
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public static void cityInfo() {
		System.out.println("Welcome to campus");
	}
}
