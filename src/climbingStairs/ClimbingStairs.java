package climbingStairs;

import java.util.Scanner;

public class ClimbingStairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("How many steps there are: ");
		try {
			int n = scan.nextInt();
			scan.close();
			if (n <= 2){
				System.out.printf("There are %d distincts ways to climb %d steps", n, n);
		        }
			else{
	            int step1 = 1, step2 = 2;
	            for (int i = 3; i < n; i++){
	                int temp = step2;
	                step2 += step1;
	                step1 = temp;
	            }
            System.out.printf("There are %d distincts ways to climb %d steps", step1 + step2, n);
			}
		}catch (Exception e){
			System.out.println("You need to enter a integer number!");
		}
		
    } 

}

