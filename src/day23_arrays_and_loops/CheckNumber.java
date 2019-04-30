package day23_arrays_and_loops;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=20; i++) {
			if(i>=5&&i<=10) {
				continue; //>>>> if condition is true skips it!
			}
			System.out.println("Number "+i);
		}
	}

}
