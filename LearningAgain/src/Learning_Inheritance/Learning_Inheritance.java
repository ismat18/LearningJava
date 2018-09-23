package Learning_Inheritance;

public class Learning_Inheritance {
    
	int a = 10;
	static String g = "Paul";
	boolean c = true;
	int f = 40;
	
	public void calling () {
		
	System.out.println("I am calling you");
	
	}
	
	//Over writing the method in LearningInheritance
	public static void hiprint() {
		System.out.println("Hi there");
	}
	
	private static int d = 20;
	public static void yo() {
		System.out.println(d);
		System.out.println(d+add());//+ Private add()
		
	}
	
    
	private static int add() {
		return 5+5;
	}
	
	private int e =70;
    public static void yoyoyo() {
    	Learning_Inheritance ty = new Learning_Inheritance();
        System.out.println(ty.e);
	}
    static int h = 100;
   // public static int addi() {
    	//return h;
    //}
    
    void name() {
    	System.out.println("My car is Toyota");
    }
	
    
	}
	
	
