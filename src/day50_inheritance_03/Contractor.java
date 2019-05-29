package day50_inheritance_03;

public class Contractor extends Employee{
	
	public void calculatePay(int hours, double rate) {
		System.out.println("Contractor total pay: "+(hours*rate+200));
	}

}

/*Employee
	FullTimeEmployee
	Contractor

calculatePay(int hours, double rate)

Employee version:
	"Employee total pay: " + hours * rate

FullTimeEmployee version:
	//should include 5% bonus
	"FullTime employee total pay: " + total

Contractor version:
	//gets $200 extra for each pay
	"Contractor employee total pay: " + total
	*/