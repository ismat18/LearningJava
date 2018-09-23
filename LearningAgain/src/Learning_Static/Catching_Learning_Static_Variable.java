package Learning_Static;

public class Catching_Learning_Static_Variable{



	public static void main(String[] args) {

		Learning_Static_Variable s1 = new Learning_Static_Variable("Paul",10);
		Learning_Static_Variable s2 = new Learning_Static_Variable("Julian", 20);
		s1.display();
		s2.display();
		
		//Learning_Static_Variable.university;
		//System.out.println(Learning_Static_Variable.university);
		
		//Learning_Static_Variable.age;
		System.out.println(Learning_Static_Variable.age);//Staic - calling class
		
	   
		hello();
		
		Catching_Learning_Static_Variable P1 = new Catching_Learning_Static_Variable();
		P1.hi();
		
		sum(5,5);
		int result = sum(5,5);
		System.out.println(result);
		
		P1.multi(10,10);
		int result1 = P1.multi(10,10);
		System.out.println(result1);
	}
	
	

	public static void hello() {
		System.out.println("my name is pavel" );
	}
	
	public void hi() {
		System.out.println("My name is rubel");
	}
	public static int sum(int a , int b) {
		int sum = a+b;
		//return a+b;
		return sum;
		
	}
	public int multi(int x,int y) {
		return x*y;
	}

}

