package day50_inheritance_03;

public class FullTimeEmployee extends Employee{

	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("FullTimeEmployee total pay: "+(hours*rate+hours*rate*0.05));
	}
}
