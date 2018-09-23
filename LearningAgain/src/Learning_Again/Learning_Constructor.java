package Learning_Again;

public class Learning_Constructor {

	public static void main(String[] args) {
		//Constructor is a special type of method that is used to initialize the object
		//Creating Constructor with the same name as your class name and gets initialized the moment we create an object.
		//If there is a Defaul/Parameterized constructor, you can also create Method with same name as Class.
		//Number of Arguments need to be different
		//Data Types are different in Argument
		//It has no return type and no void
		
		Learning_Constructor abc = new Learning_Constructor();
		Learning_Constructor def = new Learning_Constructor(10);
		
		def.sampleE(10);
		Learning_Constructor ijk = new Learning_Constructor("Hello");
		name1("Bengir");
		Learning_Constructor lmn = new Learning_Constructor(10, "Value is ten");
		Learning_Constructor pq = new Learning_Constructor("Value is twenty", 20);
		Learning_Constructor rs = new Learning_Constructor("My name is Pavel", "I am learning Constructor");
		Learning_Constructor tu = new Learning_Constructor(50,50);
		
		

		//sum1(30, 40);
		//System.out.println(sum1(30, 40));
		//abc.sum1(30, 40);
		//System.out.println(abc.sum1(30, 40));
		//def.sum1(30, 40);
		//System.out.println(ijk.sum1(30, 40));
		
		LearningConstructor();//
		
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
      
      public int sampleE(int a) {
    	  return a;
      }
      
      Learning_Constructor(String b) {
    	  System.out.println(b);
      }
      
      public static void name1(String g) {
    	  System.out.println(g);
    	  
      }
      Learning_Constructor(int r, String s ) {
    	  System.out.println(r + " " + s);
      } 
      
      Learning_Constructor(String t, int u ) {
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
      
      
      
      //If there is a Defaul/Parameterized constructor, you can also create Method with same name as Class.
      
      public static void LearningConstructor() {
    	  System.out.println("I am creating method even thogh I have same method name as constructor");
      
}
}
