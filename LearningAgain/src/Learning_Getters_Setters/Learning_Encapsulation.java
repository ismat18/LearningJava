package Learning_Getters_Setters;

public class Learning_Encapsulation {
	
	//Encapsulation is packaging variables and Methods into a single unit.
	//Protecting data by declearing them as Private.
		
	int age;
	String name;
	void eat() {}
    void talk() {}
    
    //They are all public so we can just create another class and create an object for this class and call it
    
    private int dob= 10;
    //It is private so can't use it. So for this we create Getters and Setters.
    
   // or
    
    public int gettingdob() {//We can create the method and create an object in another class and call it
    	return dob;
    }
    
    
    
    
    }
