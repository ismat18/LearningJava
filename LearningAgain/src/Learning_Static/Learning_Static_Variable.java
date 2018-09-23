package Learning_Static;

//Static variable is not related to object but related to class

public class Learning_Static_Variable {
	//Local variable - inside the Method
	//Instance Variable - inside class
	//Class Variavle - Staic Variable
	
    String name; //Instance Variable
    int id;
    static String university ="NYCCT";// common variable
   
    static int age =20; 
    
   
    
    Learning_Static_Variable(String n,int i){//constructor
    	name =n;
    	id = i;
    }
    
    void display() {
    	System.out.println("Student name:" + name);
    	System.out.println("Student id:" + id);
    	System.out.println("University name:" + university);
    }
}

