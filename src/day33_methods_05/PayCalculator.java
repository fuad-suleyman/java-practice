package day33_methods_05;

public class PayCalculator {
	
	public static int getHourlyPay (int hours,int rate) {
		
		int total = hours*rate;
		
		if (rate<=0) {
			System.out.println("Invalid rate");
			return 0;
		}else
			if (hours<=0) {
				System.out.println("Invalid hours");
				return 0;
			}
		return total;
		
		
	}
	public static void main(String[] args) {
		System.out.println(getHourlyPay(5, 0 ));
	}

}
