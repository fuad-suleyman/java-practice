package day26;

import java.util.Arrays;
import java.util.Random;

public class WarmUpTask {
	public static void main(String[] args) {
     String [] names= {"James","Mary",
		"John","Patricia",
		"Robert","Jennifer",
		"Michael","Linda",
		"William","Elizabeth",
		"David","Barbara",
		"Richard","Susan",
		"Joseph","Jessica",
		"Thomas","Sarah",
		"Charles","Margaret",
		"Christopher","Karen",
		"Daniel","Nancy",
		"Matthew","Lisa",
		"Anthony","Betty",
		"Donald","Dorothy",
		"Mark","Sandra",
		"Paul","Ashley",
		"Steven","Kimberly",
		"Andrew","Donna",
		"Kenneth","Emily",
		"George","Carol",
		"Joshua","Michelle",
		"Kevin","Amanda",
		"Brian","Melissa",
		"Edward","Deborah",
		"Ronald","Stephanie",
		"Timothy","Rebecca",
		"Jason","Laura",
		"Jeffrey","Helen",
		"Ryan","Sharon",
		"Jacob","Cynthia",
		"Gary","Kathleen",
		"Nicholas","Amy",
		"Eric","Shirley",
		"Stephen","Angela",
		"Jonathan","Anna",
		"Larry","Ruth",
		"Justin","Brenda",
		"Scott","Pamela",
		"Brandon","Nicole",
		"Frank","Katherine",
		"Benjamin","Samantha",
		"Gregory","Christine",
		"Raymond","Catherine",
		"Samuel","Virginia",
		"Patrick","Debra",
		"Alexander","Rachel",
		"Jack","Janet",
		"Dennis","Emma",
		"Jerry","Carolyn",
		"Tyler","Maria",
		"Aaron","Heather",
		"Henry","Diane",
		"Jose","Julie",
		"Douglas","Joyce",
		"Peter","Evelyn",
		"Adam","Joan",
		"Nathan","Victoria",
		"Zachary","Kelly",
		"Walter","Christina",
		"Kyle","Lauren",
		"Harold","Frances",
		"Carl","Martha",
		"Jeremy","Judith",
		"Gerald","Cheryl",
		"Keith","Megan",
		"Roger","Andrea",
		"Arthur","Olivia",
		"Terry","Ann",
		"Lawrence","Jean",
		"Sean","Alice",
		"Christian","Jacqueline",
		"Ethan","Hannah",
		"Austin","Doris",
		"Joe","Kathryn",
		"Albert","Gloria",
		"Jesse","Teresa",
		"Willie","Sara",
		"Billy","Janice",
		"Bryan","Marie",
		"Bruce","Julia",
		"Noah","Grace",
		"Jordan","Judy",
		"Dylan","Theresa",
		"Ralph","Madison",
		"Roy","Beverly",
		"Alan","Denise",
		"Wayne","Marilyn",
		"Eugene","Amber",
		"Juan","Danielle",
		"Gabriel","Rose",
		"Louis","Brittany",
		"Russell","Diana",
		"Randy","Abigail",
		"Vincent","Natalie",
		"Philip","Jane",
		"Logan","Lori",
		"Bobby","Alexis",
		"Harry","Tiffany",
		"Johnny","Kayla"};
     
     int count= names.length;
     
     System.out.println("Total names: "+count);
     System.out.println(Arrays.toString(names));
     System.out.println("*************************");
     
     for(int i=0; i<names.length; i+=2) {
    	 System.out.println(names[i]+","+names[i+1]);
     }
   
     System.out.println("*************************");
     
     for(int i=0; i<names.length; i+=2) {
    	 System.out.println(names[i]);
    	 
    	 System.out.println("\nRANDOM NAME");
    	 Random random = new Random();
    	 int r= random.nextInt(names.length);
    	 System.out.println("Random name: "+names[r]);
     }
    	 System.out.println("\n***********************************");
    	 
    	for(int j=0; j<names.length; j++ )
    	 {
    		 if(names[j].length()>4) {
    			continue;
    			    		 }
    		 System.out.println(names[j]);
    	 }
    	
    	System.out.println("\n*************************");
    	 
    	 String namesUpto4 = "";
         String names5to6 = "";
         String names7orMore = "";
    	 
    	 for(int idx = 0; idx<names.length; idx++)
    	 {
    		 if(names[idx].length()>0&&names[idx].length()<=4) {namesUpto4+=names[idx]+", "; }else
    			 if(names[idx].length()>=5&&names[idx].length()<=6) {names5to6+=names[idx]+", "; }else
    				 if(names[idx].length()>=7) {names7orMore+=names[idx]+", "; }
    		 
    		 
    	 }
    	 System.out.print(namesUpto4);
    	 System.out.println();
    	 System.out.print(names5to6);
    	 System.out.println();
    	 System.out.print(names7orMore);
    	 System.out.println("\n********************************");
    	 System.out.println(Arrays.toString(names));
    	 
    	 for(int i=0; i<names.length; i+=2) {
    		 
        	 System.out.print(names[i+1]+", "+names[i]+", ");
         }
    
    
     
	}
	

}
