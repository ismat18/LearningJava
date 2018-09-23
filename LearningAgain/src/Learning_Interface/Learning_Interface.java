package Learning_Interface;

public interface Learning_Interface {
	//Interface is collection of Abstract Method
	//It supports multiple Inheritance.
	//Class name need to be Interface
	//Inside Interface class  - Method name does not have to be abstract. Compiler will treat this as abstract Method.(public abstract void display())
    //All Methods are public
	//Interface does not contain constructor
	//Variable needs to be constant variable - compiler will treat as "public static final". 
	//interface class - inherited another interface class - use extends
	//interface class - inherited another class - use implements.
	//cannot create object for interface class
	
	int age = 20;//will treat as public static final int =20;
	
	void eat();//will treat as public abstract void eat():
}
