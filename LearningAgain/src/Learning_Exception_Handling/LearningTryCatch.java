package Learning_Exception_Handling;

import java.util.Scanner;

import Learning_Again.Learning_MethodOverLoading;

import java.util.*;


public class LearningTryCatch {

	public static void main(String[] args) {
		// Need to create an object if it is not in same package.Even though it is static.
		// When you extend in same package you dont need to cretae an object when it is static. Just call it.
	
//		LearningMethodOverLoading abc = new LearningMethodOverLoading();
//		abc.sum();
//		abc.sum(20);
		//Exception e
		//ArithmeticException //Ex. 10/0
		//ArrayIndexOutofBoundsException// for Array
		//InputMismatchException // string -int
		//NullPointerException 
		//Illegalargumentexception 
		
		//Sum();
		NullPointerExceptionExample(null);
		//Try Catch
		try{
		Scanner info = new Scanner(System.in);
		
		
		int age;
			
	    System.out.println("How old are you?");
	    age = info.nextInt();
        System.out.println("Your age is:" + age);
		}
	
		catch(Exception e) {
			System.out.println("Making Mistake");
		}
		
		finally {
			System.out.println("Move on");
		}
		
		
	}

	public static int Sum() {
		int age=10;
		try{
			Scanner info = new Scanner(System.in);	
		    System.out.println("How old are you?");
		   // int age;
		    age = info.nextInt();
	        System.out.println("Your age is:" + age);
			}
			
			catch(InputMismatchException e) {
				System.out.println("Making Mistake" +e);
			}
			
			finally {
				System.out.println("Move on");
			}
		return age;
	}
	
	public static String NullPointerExceptionExample(String age) {
		try{
			Scanner info = new Scanner(System.in);	
		    System.out.println("How old are you?");
		   // int age;
		    age = info.nextLine();
	        System.out.println("Your age is:" + age);
			}
			
			catch(NullPointerException e) {
				System.out.println("Making Mistake" +e);
			}
			
			finally {
				System.out.println("Move on");
			}
		return age;
	}
		
	}


