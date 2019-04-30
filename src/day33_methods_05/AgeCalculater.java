package day33_methods_05;

public class AgeCalculater {

	public static int calculateAge(int year) {
		int age = 2019 - year;
		if (age >= 0 && age <= 14) {
			System.out.println("Child");
			return age;
		} else if (age >= 15 && age <= 25) {
			System.out.println("youngster");
			return age;
		} else if (age >= 26 && age <= 64) {
			System.out.println("adult");
			return age;
		} else if (age >= 65) {
			System.out.println("Senior");
			return age;
		} else {
			System.out.println("Invalid age");
		}
		return age;

	}

	public static void main(String[] args) {
		int result = calculateAge(2025);
		//calculateAge(1991);
		System.out.println(result);
	}
}
