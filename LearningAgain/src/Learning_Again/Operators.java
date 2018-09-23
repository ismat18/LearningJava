package Learning_Again;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		
		
		//Math(Arithmetic) Operators
		// +, -, *, /, %(Modulas), =
		int boy, girl, people;
		girl = 7;
		boy = 3;
		people = girl % boy;
		
		System.out.println(people);
		
		// Assignment Operator
		// = , +=, -=, *=, /=, %=
		
		int x=7;
		int y=2;
		x+=y;// x = x+y
		System.out.println(x);
		x%=y;//x = x%y = 1
		System.out.println(x);
		
		//Unary Operators
		//+,-
		int z =10;
		int result;
		result = +z;
		System.out.println(result);
		
		result = -z;
		System.out.println(result);
      
		//Increment Operators
		int tuna = 5;
		y = ++tuna;//Pre fix increment
		System.out.println(y);
		y=tuna++;//post fix increment
		System.out.println(y);
		y=tuna;
		System.out.println(y);
		
		tuna = tuna + 5;//Assignment operator
		System.out.println(tuna);
		
		//Relational Operator
		// > - greater then = 2>1  = 2 is greater then
		// > = - greate then or equal to
		//< -  Less then
		//<= - less then or equal to
		// == - equal
		//!= - Not equal
		
		//Logical Operators
		//&& - And
		//|| - or
		//!
		
		//Conditional Operators
		//? : - Like if else 
		
		Scanner abc = new Scanner(System.in);
		int g; 
		int l; 
		int number;
		System.out.println("Enter two Numbers" );
		g = abc.nextInt();
		l = abc.nextInt();
		number = (g>l) ? g:l;
		System.out.println(number);
		
		
		
		
		
	}

}
