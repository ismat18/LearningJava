package Learning_Type_Casting;

public class Type_Casting {

	public static void main(String[] args) {
		
		//Primitive Data Type: boolean, char, byte, short, int, long, float, double
		//Non Primitive Data Type: String, classes, Method, Constructor, object....
		
		//Primitive data Type casting
		//Implicit Type casting: byte->short->int->long->float->double
		
		int x=10;
		double y=x;
		System.out.println(y);
		
		//Explicit Type casting: double->float->int->short->byte
		
		double a=20.0;
		int b = (int) a;
		System.out.println(b);
		
				
		//Non primitive data type casting: object type casting
		
		//Upcasting
		//Person P1 = new Teacher() // Person is superclass and Teacher is subclass
		
		//downcasting
		// Teacher T1 = new Person()//Java does not suppert.
		//Teacher T1 = (Teacher) new Person()//Java supports.
		
		
		//Anonymous Class:Do overriding from Main class during run time
		
		//Person p = new Person(){
//		   void display() { //overriding the display method
//			   
//			   System.out.println("Hello");
//		   }
//	
	   //   };
		//p.display();
		
		

	}

}
