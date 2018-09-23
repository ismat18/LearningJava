package Learning_Again;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter the first number: ");
		number = abc.nextInt();
		if (number%2==0) {
			System.out.println("It is an even Number");
			
		}else {
			System.out.println("It is an Odd number");
		}

	}

}
