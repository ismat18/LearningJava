package Learning_Abstract;

public abstract class Learning_Abstract {
	
	//Abstrac Class - can have Abstract Method and non Abstract Method
	//If there is abstract method, need to create abstrac class
	//Abstract Method - does not have body
	//can inherit Abstract class but need to override the method.
	//for abstract class cannot create object but reference variable
	//can have static, non static, final, non finalvariable.
	
	
	void hiprint() {
		System.out.println("Printing something");
	}
	
	abstract void hello();
	

}
