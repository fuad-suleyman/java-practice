package day27_arrays_05;

public class Task2 {
	public static void main(String[] args) {

		/*
		 * Java --> programming language Selenium --> Test Automation TestNG --> Unit
		 * Tests JUnit --> Unit Tests Cucumber --> BDD Style testing Git --> Version
		 * control Maven --> Building and execution for project
		 */

		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };

		for (int i = 0; i < tools.length; i++) {

			if (tools[i].equalsIgnoreCase("Java")) {
				System.out.println("Java --> programming language");
			} else if (tools[i].equalsIgnoreCase("Selenium")) {
				System.out.println("Selenium --> Test Automation");
			} else if (tools[i].equalsIgnoreCase("TestNG")) {
				System.out.println("TestNG --> Unit Tests");
			} else if (tools[i].equalsIgnoreCase("JUnit")) {
				System.out.println("JUnit --> Unit Tests");
			} else if (tools[i].equalsIgnoreCase("Cucumber")) {
				System.out.println("Cucumber --> BDD Style testing");
			} else if (tools[i].equalsIgnoreCase("Git")) {
				System.out.println("Git --> Version control");
			} else if (tools[i].equalsIgnoreCase("Maven")) {
				System.out.println("Maven --> Building and execution for project");
			} else {
				System.out.println("Unknown input");
			}

		}

	}

}
