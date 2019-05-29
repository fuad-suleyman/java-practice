package day53_inheritance_06;

public class City {
	private int id;
	private String name;
	public int count=100;
	
	
	
	
	public void letsBuildARoad() {
		buildARoad();
		}
	
	public static void buildARoad() {
		System.out.println("City bulding a road");
	}
	
	
	
	
	public City(int id, String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public int hashCode() {
		return id+name.length();
	}
	
	
	
	
	@Override
	public String toString() {
		return "id: "+id+" name: "+name+" count: "+count;
		
				}	
	
	
	@Override
	public boolean equals(Object obj) {
		City anotherCity=(City)obj;
		return this.id==anotherCity.id&&this.name.equals(anotherCity.name);
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 

}
