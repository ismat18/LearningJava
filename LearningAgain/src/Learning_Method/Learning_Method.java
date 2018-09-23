package Learning_Method;


//Difference between Method and Constructor
//Constructor name is same name as class name but Method can be any name.
//Constructor does not have return type but Method has return Type.
//Don't need to call constructor but need to call method(def.display();)
//Constructor is used to initialize the state of an object but Method is used to expose behaviour of an object.

public class Learning_Method {

	String name;
	int age;
	
	String Gender;
	int dob;
	
	
	
	
	void display() {
		
		System.out.println("Name is:" + name); //Print from here or print from main class
		System.out.println("Age is: "+ age);
		System.out.println("\n");
		
	}
	
	
	//Parameterized Method
	void setinfo(String n, int k) {
		name = n;
		age =k;
	
	}
	
	void result(){
		System.out.println(name);
		System.out.println(age);
	}
//	Learing_Method(String h, int k){//constructor //Passing the parameter in object
//		name=h;
//		age = k;
//		
//		System.out.println(name);
//		System.out.println(age);
//		
//		
//		
//	}

}
