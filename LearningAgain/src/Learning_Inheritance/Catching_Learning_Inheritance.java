package Learning_Inheritance;

public class Catching_Learning_Inheritance extends Learning_Inheritance{

	      
	  static int z = 10;//Inside the class but outside of the main method
	
	   public static void main(String[] args) {
		//This is subclass(Inheritance) which will inherit from Superclass(Learning_Inheritance).
		//For Static we don't need to create an object.
		//For non static we need to create an object
		//We use the word extends in order to inherit.
		//you can also inherit variables - int, String, boolean but need to crate an object
		//Private and protected method cannot be inheritaed.Need to use getters and setters Method and create an object.
				
		hiprint();//will print because it is static and I inherited.
		
		yo();
		
		yoyoyo();
		
		Learning_Inheritance x = new Learning_Inheritance();
		x.calling();//this is non static that's why need to create an object
		//x.hiprint();//this is static.
		//you can also inherit variables - int, String, boolean but need to crate an object
		
		System.out.println(x.f);
		
		//x.b;
		//10;
		int b=x.a;
		System.out.println(b);
		System.out.println(b + 100);//Not static
	
		
		System.out.println(g);//Static
		
		System.out.println(h);
		

		System.out.println(z);
		
	    //add();will not work since it's private
		
		x.name();
		
	}
	  public static void hiprint() {
		  System.out.println("Hello my name is pavel");//Method Over writing hiprint
		                                                //hiprint has to be inside main method.
		                                                //Just overwriting it.
	   }

}
