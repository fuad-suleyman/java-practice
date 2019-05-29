package day45_review;

public class EtsyDotCom {
	
	public static void main(String[] args) {
		
		EtsyAccount acct1=new EtsyAccount();
		System.out.println(acct1.toString());
		acct1.setEmail("pumev@mrmail.info");
		acct1.setFirstName("pumev");
		acct1.setPassword("bulgaria123");
		
		System.out.println(acct1.toString());
		
		System.out.println("****************************");
		
		
		EtsyAccount acct2 = new EtsyAccount();
		acct2.setEmail("helirevaroyalhost.info");
		acct2.setFirstName("helireva123");
		acct2.setPassword("abc12");
		System.out.println(acct2.toString());
		System.out.println("****************************");
		
		
		EtsyAccount acct3 = new EtsyAccount("Helireva@royalhost.com","Helireva","royal"
				+ "" );
		System.out.println(acct3.toString());
		
		System.out.println("****************************");
		
		EtsyAccount acct4=new EtsyAccount("Fuad.msuleyman@gmail.com","Fuad");
		System.out.println(acct4.toString());
		
		
		
	}

}
