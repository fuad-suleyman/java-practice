package day40_customclasses_01;

public class Employee {

	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + " is working hard ...");
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting ...");
	}
	//"Name[name], jobTitle[jobTitle], salary[salary]"
	public void introduce() {
		System.out.println("Name[" + name +"], jobTitle[" + jobTitle 
				+"], salary[" + salary + "]");
	}
	

}
