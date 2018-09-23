package Learning_Again;

import Learning_Inheritance.Learning_Inheritance;

public class Static_NonStatic extends Learning_Inheritance {

	public static void main(String[] args) {
		// Static Keyword is used for memory management
		//It makes the program more effeciant by saving memory
		//static variable
			
		//static method
		//static block
		name();//Static - Don't need to create an object
		
		Static_NonStatic callingbird = new Static_NonStatic();
        callingbird.bird();//Non Static - Need to create an object
       
       Learning_Inheritance xy =new Learning_Inheritance() ;
       xy.calling();;
	   // xy.hiprint();
       hiprint();
	   //calling();
	
	}
	
	public static void name() {
		System.out.println("Myname is Pavel");
	}
	
	public void bird() {
	System.out.println("Hi Bird");
	
	}

}
