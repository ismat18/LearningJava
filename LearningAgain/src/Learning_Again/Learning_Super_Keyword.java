package Learning_Again;

public class Learning_Super_Keyword {

	public static void main(String[] args) {
		//Super keyword is used to refer super class object
		//It is used to call super class variables
		//It is used to call Super class overridden Method
		//it used to call super class constructor
		
		//Super class variables
		//class A
		//Public class A{
		//int x=5}
		
		//class B
		//public class B extends A{
		/// x=10}
		//System.out.println(x);//This will print out 10
		//System.out.println(super.x);//It will call from class A and print out 5

		
		
		//Super class Method
		//class A
		//public class A{
		//void display{
		//System.out.println("Printing");}
		//}//will print Printing
		
		//class B
		//public class B extends A{
		//super.display;
		//void display{System.out.println("Hello");}}//will print out Hello because it will override it.
		
		//Super class constructor
		//class A
		//public class A{
		//A(){
		//System.out.println("A constructor");}
		//}//will print "A constructor"
				
		//class B
		//public class B extends A{
		//B(){
		//super();//just need to say super()
		//System.out.println("B constructor");}}//will print out "A constructor" and "B constructor".
				
		
		 
	}

}
