package Learning_This;

public class Learning_this {
	//It can call current class instance variable.
	//It call current class constructor.
	//It can call current class Method.
	//It can be passed as an argument in the Method. (Event Handling).

	
	String name;//Instance Variable
	int age;
    String haircolor;
			
    Learning_this(String name, int age){//Local Variable
    	
    	this.name =name;//Calling current class instance variable
    	this.age = age;
    }
    
    Learning_this(String name, int age, String haircolor){
    	//this.name = name;
    	//this.age = age;
    	//Insted of name and age, using this keyword to call name, age for Constructor
    	this(name,age);//calling current class constructor
    	
    	this.haircolor = haircolor;
    }
    void display() {
    	System.out.println("Name is: " + name);
    	System.out.println("Age is: " + age);
    	System.out.println("Haircolor is: "+ haircolor);
    }
	
   
    void yes() {
    	display();//calling the current class Method.
    	//or
    	this.display();
    	System.out.println("By");
    }
    
    
    
}

