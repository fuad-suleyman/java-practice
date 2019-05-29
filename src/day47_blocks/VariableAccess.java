package day47_blocks;

public class VariableAccess {
	//non-static 
	int myInstanceVar=40;
	
	//static
	static int myStaticVariable=55;
	
	
	public static void main(String[] args) {
		System.out.println(myStaticVariable);
		VariableAccess v= new VariableAccess();
		
		System.out.println(v.myInstanceVar);
		
		System.out.println(VariableAccess.myStaticVariable);
		
	}

}
