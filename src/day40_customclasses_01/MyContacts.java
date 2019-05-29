package day40_customclasses_01;

public class MyContacts {

	public static void main(String[] args) {
		Contact evgenia = new Contact();
		evgenia.name="Evgenia Jalilova";
		evgenia.phoneNumber="(202)-333-4444";
		evgenia.email="EvgeniaJalilova@gmail.om";
		
		evgenia.call();
		evgenia.sendMessage();
		evgenia.sendEmail();
		
		
		System.out.println("******************");
		Contact orhan=new Contact();
		
		orhan.name="Orxan Sultanov";
		orhan.phoneNumber="(929)555-4433";
		orhan.email="OrxanSultanov@gmail.com";
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		
	}
	
	
	

	
}
