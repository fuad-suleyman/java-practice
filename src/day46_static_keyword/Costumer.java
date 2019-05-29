package day46_static_keyword;

public class Costumer {
	private String name;
	private String email;
	static  int count;
	//cons  1
	Costumer(){
		name="undefined";
		email="undefined";
		
	}
	
	//cons 2
public Costumer(String name, String email) {
		
		this.name = name;
		this.email = email;
		count++;
	}

	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email=email;
	}
	
	
	public String getEmail() {
		return email;
	}
	

	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
