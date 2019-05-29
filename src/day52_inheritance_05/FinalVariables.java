package day52_inheritance_05;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSANGERS;
	public final String JAN="January";
	public static final String COMPANY_NAME="Cybertek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME="admin@gmail.com";
	}
	
	public FinalVariables() {
		MODEL_3_MAX_SPEED=190;
	}
	/*
	 public FinalVariables(int max) {  //this works too;
		MODEL_3_MAX_SPEED=max;
	}
	*/
	
	{
		MODEL_X_PASSANGERS=7;
	}
	
	
	public static void main(String[] args) {
		
		final int MAX_PASSANGERS_COUNT=5;
	//	MAX_PASSANGERS_COUNT=5;
		System.out.println(MAX_PASSANGERS_COUNT);
		
		final int SSN;
		SSN=314569841;
		System.out.println(SSN);
		//SSN++; is not possible.
		
		FinalVariables finalVar=new FinalVariables();
		System.out.println("Max range for roadster: "+finalVar.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: "+finalVar.MODEL_3_MAX_SPEED);
		System.out.println("Model X passangers: "+finalVar.MODEL_X_PASSANGERS);
		System.out.println("Company name: "+COMPANY_NAME);
		System.out.println("Company name: "+FinalVariables.COMPANY_NAME);
	}

}
