package Learning_Method;

public class Learning_Method_Over_Loading {
	
	//Method overloading vs Metod over riding
	
	//Method overloading hapens in same class vs Methos overriding hapens in multiple class
	//Method overloading parameterized must be different vs Method overriding parameterized must be same
	//Method overloading does not need Inheritance vs Method overriding has Inheritance.
	//Method overloading return type may not be the same vs Method overriding Method return type must be same
	
	void sum() {
		System.out.println("I am printing");
	}

	void sum(int a) {
		System.out.println("Hi There");
		System.out.println(a);
	
    }
    
	void sum(String b) {
		System.out.println("How are you");
		System.out.println(b);
    }
	
	//You can not overload by making different return types with same name.
	//public static int sum() {}
		
	
	public static int sum(int p,int q) {
		return p+q;
		
	}
	public static String sum(int r, String s) {
		return r+s;
	}
	
	public static String sum(String t, int u) {
		return t+u;
	}
	

}
