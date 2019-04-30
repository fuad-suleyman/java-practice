package day24_arrays;

import java.util.Arrays;

public class LotteryTickets {
	public static void main(String[] args) {
		int [] lotteryNumbers= {12, 45, 3, 62, 42, 90};
		
		String numbers=Arrays.toString(lotteryNumbers);
		
		System.out.println(numbers);
		
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		String [] as= {"dfddffd","hello"};
		

	}

}
