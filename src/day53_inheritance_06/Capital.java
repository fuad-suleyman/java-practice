package day53_inheritance_06;

public class Capital extends City {

	private long population;
	public int count=1;
			
	public static void buildARoad() {
		System.out.println("Capital city bulding a road");
	}
	
	public Capital (int id, String name, long population) {
		super(id, name);
		this.population=population;
	}
	
	@Override
	public String toString() {
		 return super.toString()+" population: "+population;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	
	
	
	
}
