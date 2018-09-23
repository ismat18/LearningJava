package Learning_Switch;

import java.util.Scanner;

public class Switch_Conditional {

	public static void main(String[] args) {
		
		//Conditional Statement
		//switch(expression){
		//case value1:
		  //codes to be executed
		//break;
		//case value2:
		  //codes to be executed
		//break;
	
		//}
		
		Scanner enter = new Scanner(System.in);
		
		int digit;
		
		System.out.println("Enter digit: ");
		
		digit = enter.nextInt();
		
		switch (digit) {
		
		case 0:
			System.out.println("Zero");
			break;
			
		case 4:
			System.out.println("Four");
			break;
		
		default:
		System.out.println("Wrong Answer");
		
		
		}
		

	}

}
