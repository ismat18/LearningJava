package Learning_Again;

import java.util.Scanner;

public class Switch_Break {

	public static void main(String[] args) {
		
//		int age=10;
//		switch (age) {
//		
//		case 5:
//			System.out.println("Your age is 5");
//			break;
//					
//		case 10:
//			System.out.println("Your age is 10");
//			break;
//			
//		default:
//			System.out.println("YOU ARE YOUNG");
//			break;
//		}
			
		Scanner abc = new Scanner(System.in);
		int Digit;
		System.out.println("Enter the digit: ");
		Digit = abc.nextInt();
		
		switch(Digit){
		
		case 0:
			System.out.println("Zero");
			break;
		
		case 3:
			System.out.println("Three");
			break;
		case 5:
			System.out.println("five");
		   break;
		   
		 default:
			 System.out.println("Not a digit");
			 break;
		   
		}
		
		
		
	}

}
