package Learning_Again;

import java.util.Scanner;

public class Return {
	
	public static void main(String[] args) {
		//need to create an object if it's non static and in same file
		//need to create an object if it's non static and different file.
		//after creating an object you can access both static and non static files.
		
		//int x=10;
		//echo(x);
		name();
		name1("Hello");
		addition(10,20);
		
		number();
		System.out.println(number());
		
		//hello();
		System.out.println(hello());
		
		Multipication(2,2);
		System.out.println(Multipication(2,2));
		
		Return ab = new Return();
		ab.learn();
		
		
//		Return abc = new Return();
//		abc.learn();// Not static so created an object
//		abc.information();
		
		
//		CallingFromAnotherClass d = new CallingFromAnotherClass();
//		d.calling();
//		d.hiprint();
		
		
		
	}
	    
		
		public static void name() {
			
			System.out.println("My name is pavel");
		}
		
		public static void name1(String a) {
			System.out.println(a);
			
		}
	   public static void addition(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		}
	
	   public static int number() {
	   return 10;
	   }
	   
	   public static String hello() {
		   return "Pavel";
	   }
	   
	   
	   public static int Multipication(int c, int d) {
		int mult = c*d;	
		return mult;
		
		}
	
	    public void learn () {
	    	
	    	int a=10;
	    	int b=20;
	    	
	    	if (a>b) {
	    		System.out.println("a is less then b");
	    	}
	    	else if (a<b){
	    	System.out.println("a is more then b");
	    		
	    	}
	    	else {
	    		System.out.println("I am not sure");
	    	}
	    }
	    
	    public void information() {
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
	
	    }
	
	
}

//Mainclass();
//addition(20,30) ;
////sum(40,20);
//System.out.println(sum(40,20));
//displayNumber();
//System.out.println(displayNumber());
//
//number();
//System.out.println(number());
//
//
//System.out.println(MyName());
//
//}
//
//public static void Mainclass() {
//	System.out.println("Print something");
//		
//}
//
//public static void addition(int a,int b) {
//
//	int sum=a+b;
//	System.out.println(sum);
//	
//}
//
//public static int sum(int x, int y) {
//return x+y;
//}
//
//public static int displayNumber() {
//	int i = 5;
//	int j = 5;
//	return i+j;
//}
//
//public static int number() {
//return 10;
//}
//
//public static String MyName(){
//return "pavel";
