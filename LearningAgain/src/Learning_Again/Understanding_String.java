package Learning_Again;

public class Understanding_String {

	public static void main(String[] args) {
        
		//String Literal - String Constant Pool
		//Pavel is the Object
		//str1 is the reference to the object
		
		String str1 = "Pavel";
        System.out.println(str1);
	    
        //str2 is the reference will point to the same object Pavel
        String str2 = "Pavel";
        System.out.println("My name is: " + str2);
	    
       //String Object - Heap
        //Create new Object
        String str3 = new String ("Zahin");
        System.out.println(str3);
      
        //str4 will refer to the new object
        String str4 = new String ("Zahin");
        System.out.println(str4);
 
        
       String str5 = "hello";
       String str6 = " ";
       String str7 = "John";
       
       String  greeting = str5 + str6 + str7;
       
       System.out.println(greeting);
       
       System.out.println("Hello" + " " + "John");
      
       int Value = 10;
       System.out.println("The value of the integer is: "+ Value + ".");
       
       
	
	}

}
