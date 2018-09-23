package Learning_Inheritance;

public class Inheritance {
	//We use Inheritance for code reusability
	//for Method overriding
	//For Static we don't need to create an object.
	//For non static we need to create an object
	//We use the word extends in order to inherit.
	//you can also inherit variables - int, String, boolean but need to crate an object
	//Private and protected method cannot be inheritaed. Need to use getters and setters Method and create an object.
	
	//Different Type of Inheritance - Single Inheritance, Multilevel Inheritance, Hierarchial Inheritance, Multiple Inheritance
	
	String name;
	int age;
	
	private int dob;
	public int showingdob() {
		return dob;
	}	
		
		
    private int height;
    
    
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}




	void show() {
		System.out.println(name);
		System.out.println(age);
	}

}
