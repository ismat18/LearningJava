package Learning_Constructor;

public class Learning_Constructor {
	//We can create constructor so we can initialize the object rightaway.
	//Difference between Method and Constructor
	//Constructor name is same name as class name but Method can be any name.
	//Constructor does not have return type but Method has return Type.
	//Don't need to call constructor but need to call method(def.display();)
	//Constructor is used to initialize the state of an object but Method is used to expose behaviour of an object.
	
	String name;//Method
	int age;
	
	String city;
	int dob;
	
	void what(String a, int b) {//Parameterized Method
		city = a;
		dob = b;
		
		
	}
	int squre (int value) {
		return value*value;
	}
	void ola() {
	System.out.println(name);
	System.out.println(age);
	}

	void hello() {
	System.out.println(city);
	System.out.println(dob);
	
}
	
	  Learning_Constructor()//default constructor. No Parameterization.
      {    	  
    	  System.out.println("Hi There");
      }
      
      //Parameterized Constructor
      //Constructor Overloading
      Learning_Constructor(int a) {
    	  System.out.println(a);
      }
      
          
      
      Learning_Constructor(String b) {
    	  System.out.println(b);
      }
      
     
      Learning_Constructor(String r, int s ) {
    	  city= r;
    	  dob =s;
    	  
    	  System.out.println(r + " " + s);
      } 
      
      Learning_Constructor(int t, String u ) {
    	  System.out.println(t + " " + u);
      }
      
      Learning_Constructor(String v, String w ) {
    	  System.out.println(v + ". " + w);
      }
      
      public Learning_Constructor(int p, int r ) {
    	  System.out.println(p + " + " + r);
      }
      
      public static int sum1(int a, int b) {
    	  int result;
    	  return result = a+b;
    	  
      }
	

	
	

}
