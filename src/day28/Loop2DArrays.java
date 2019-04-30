package day28;

import java.util.Arrays;

public class Loop2DArrays {
	
	public static void main(String[] args) {
		
		String [][] pizzas= {
				{"pineapple", "pepperoni"},
				{"anchovies", "mushroom","olives" },
				{"4 cheese"},
				{"chicken", "tomatoes","jalapeinons","onios"},
				{"green pepper", "zuccini", "brocolli","spinach","spinach"}
				};
		
		String pizza[]= {"adaf","afsfas","affs"};
		
		for (String str []: pizzas) {
			System.out.println(Arrays.toString(str)); 
		}
		System.out.println("*********************************");
		for(String topping : pizzas[2]) {
            System.out.println(topping);
        }
		System.out.println("\n*********************************");
        int[][] students = {{4,5,6}, 
                           {12,5,7}, 
                           {23,56,12,55,3} 
                           };
        //2 parts: outer loop, inner loop
        //outer loop will take each group
        //inner loop will take each value/student id
        for(int[] group : students) {
            for(int studentId : group) {
                System.out.print(studentId +", ");
            }
            System.out.println();
            
            
        }
        
        int[][] nums = {
                {10, 20},               //0
                {20, 30, 40, 50},       //1
                {100, 200, 400},        //2
                {555,333,111,444,666,78}//3
                 };
 for(int i = 0;i < nums.length; i++) {
     for(int j = 0; j < nums[i].length; j++) {
         System.out.print(nums[i][j]+" ");
     }
 }
	}

}
