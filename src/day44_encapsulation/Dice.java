package day44_encapsulation;
import java.util.*;
public class Dice {

public static void main(String[] args) {
	Job job1 =new Job();
	Job job2=new Job("Java Developer");
	Job job3 = new Job("SDET","Amazon",130000.0);
	
	System.out.println(job1.toString());
	System.out.println(job2.toString());
	System.out.println(job3.toString());
	
	ArrayList<Job>jobList=new ArrayList<>();
	

	
	
	
	jobList.add(new Job("SDET","Amazon",130000.0));
	jobList.add(new Job("QA","KMPG",100000.0));
	jobList.add(new Job("Scrum Master","Delloite",90000.0));
	jobList.add(new Job("Automation tester","Google",140000.0));
	jobList.add(new Job("Developer","Apple",145000.0));
	
	System.out.println(jobList);
	System.out.println();
	
	for (Job jobs:jobList) {
		System.out.println(jobs);
	}
	
	double max=0;
	int index=0;
	for(int i =0; i<jobList.size();i++) {
		if(jobList.get(i).getAnnualSalary()>max) {max=jobList.get(i).getAnnualSalary();
		index=i;}
	}
	
	
	Job bestJob=jobList.get(index);
	
	System.out.println("Higest Salary: "+bestJob);
}
	
}
