package day53_inheritance_06;

public class TestHiding {
	
	public static void main(String[] args) {
		City city = new City(345, "London");
		Capital cap=new Capital(433,"Paris", 535784L);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap .toString());
		System.out.println();
		
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		System.out.println("******************");
		City city2=new City(1425, "Fairfax");
		Capital cap2=new Capital(78512,"Richmond", 200_000l);
		
		city2.letsBuildARoad();
		cap2.letsBuildARoad();
	}

}
