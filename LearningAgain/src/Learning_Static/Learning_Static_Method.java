package Learning_Static;

public class Learning_Static_Method {
	//Static method can't use non static member - variable or Method.
	//this and super keyword can't be used
	//static block - 
	
	int x = 10;
	void display1() {
		System.out.println("I am non Statc");
	}
	
	static void display2() {
		//display1(); Can't call display1 because it is non static
		//System.out.println(x); Non static variable
		System.out.println("I am Static");
	}

}
