package Learning_If_Else;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		//Conditional Statement
		int x =10;
		Scanner abc = new Scanner (System.in);
		System.out.println("Give me a number that satisfies me");
		x = abc.nextInt();
		
		if (x<15) {
			System.out.println("The answer is true");
		}
		else if(x>15) {
			System.out.println("The answer is falls");
		}
		else {
			System.out.println("I have no idea");
		}
	}

}
