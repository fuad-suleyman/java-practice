package day52_inheritance_05;

public class FinalMethods {
	public final void method1() {

		System.out.println("Final method ");
		
	}
	
	public final static void staticMethod (){
		
	}
	
class Sub extends FinalMethods {

	
	//public void  method1() {
	//	System.out.println("Override method1"); we cannot override 
	//}
}	

}
