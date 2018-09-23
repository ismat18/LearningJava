package Learning_Again;

import java.util.Scanner;

public class Getting_User_Input {

	public static void main(String[] args) {
		
		
	Scanner info = new Scanner(System.in);
	
	String Name, Address;
	int age, zipcode;
	
	System.out.println("What is your name?");
	Name = info.nextLine();
	System.out.println("Your name is:" + Name);
	System.out.println("What is your Address?");
	Address = info.nextLine();
	System.out.println("Your address is:" + Address);
	System.out.println("What is your Zipcode?");
	zipcode = info.nextInt();
	System.out.println("Your Zipcode is: " + zipcode);
	System.out.println("How old are you?");
	age = info.nextInt();
	System.out.println("Your age is:" + age);
		
//		
//	   double fnum,snum,answer;
//	   System.out.println("Enter the first number: ");
//	   fnum=input.nextDouble();
//	   System.out.println("Enter the second number: ");
//	   snum = input.nextDouble();
//	   answer = fnum+snum;
//	   System.out.println("Your result is: "+ answer );
	   
	   
	    
	    
	    
	    
	    
		
		
		
		

	}

}
