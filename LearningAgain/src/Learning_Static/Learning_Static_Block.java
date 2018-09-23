package Learning_Static;

public class Learning_Static_Block {
	
	static String name;
    static int age;
    
    static {    	
    	name = "Pavel";
    	age = 40;
    }
    
    static void display() {
    	System.out.println(name);
    	System.out.println(age);
    }
}
