package Learning_Again;

public class Learning_MethodOverLoading {

	public static void main(String[] args) {
		
		//Number of Arguments need to be different
		//Data Types are different in Argument
		
       
    sum();
	sum(10);
	sum("Hello");
	sum(10,10);
	System.out.println(sum(10,10));
	sum(30,"Life");
	System.out.println(sum(30,"Life"));
	sum("rose",60);
	System.out.println(sum("rose",60));
	
		
		
	}

	public static void sum() {
		System.out.println("I am printing");
	}

	public static void sum(int a) {
		System.out.println("Hi There");
		System.out.println(a);
	
    }
    
	public static void sum(String b) {
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