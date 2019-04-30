package day08;

public class IfElseVariables {
	public static void main(String[] args) {
	
		int temperature=45;
		if(temperature>=65) {
			System.out.println("It's a nice day");
			
		}else {System.out.println("Stay home");}
		
		
		//2 int va vaiables teamAScore, teamBscore
		
		int teamAscore=1;
		int teamBscore=2;
		
		if(teamAscore>teamBscore) {
			System.out.println("team A won "+"\n"+"Go team A");
			
		}else { System.out.println("team B won or it is draw");}
	}
}
