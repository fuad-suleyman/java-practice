package day31_methods_03;
import java.util.*;
public class Cars {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String a=scan.next();
		int b = scan.nextInt();
		
		drive(a,b);
		
	}

	public static void drive(String car, int speed) {
		System.out.println(car+" is driving "+speed+" mph");
	}
}
