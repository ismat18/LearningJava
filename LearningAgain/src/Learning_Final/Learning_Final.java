package Learning_Final;

public class Learning_Final {
	//final variable or constant variable - cannot change the value.
	//blank final variable - value was not initialized. Need to create constructor for this.
	//static blank final variable - need to initialize in static block
	//final Method or constant Method - to prevent method overriding but can inherit
	//final class or constant class - prevent inheritance.
	
	final String Name = "Pavel";//final Variable -value was initialized
	
	final int fees; //blank final variable - value was not initialized. Need to create constructor for this. 
	static final int age;// static blank final variable - need to initialize in static block
	
	
	Learning_Final(){//constructor to initialize blank final variable
		fees = 27000;
	}
	
	static {//static block - to initialze static blank final variable
		age = 20;
	}
	
		
	void display() {
		System.out.println(Name);
		System.out.println(fees);
		System.out.println(age);
	}
		static void result() {
	    System.out.println("Hi There");
			
		}
	

}


