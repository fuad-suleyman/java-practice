package day41_customclasses_02;

public class CapitalOne {
	public static void main(String[] args) {
		
		BankAccount acc=new BankAccount();
		acc.accountHoder="Bill Gates";
		acc.accountNumber=12345;
		acc.deposit(250);
		acc.withdraw(100);
		acc.charge(150,"wooden spoon");
		acc.showBalance();
		
	
	}

}
