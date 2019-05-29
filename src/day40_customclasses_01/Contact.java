package day40_customclasses_01;

public class Contact {
	String name;
	String phoneNumber;
	String email;

	public void call() {
		System.out.println("Calling " + name);

	}

	public void sendMessage() {
		System.out.println("Sending text  messsage to \n" + name+"\n"+phoneNumber);
	}

	public void sendEmail() {
		System.out.println("Sending email to "+email);
	}
}
