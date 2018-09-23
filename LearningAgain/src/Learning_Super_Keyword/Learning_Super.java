package Learning_Super_Keyword;

public class Learning_Super {
	//Super keyword is used to refer super class object
	//It is used to call super class variables
	//It is used to call Super class Method. overridden Method
	//it used to call super class constructor
	
	int x =10;
	
	void hiprint() {
	System.out.println("Super class Method");
	
	}
	Learning_Super(){
		System.out.println("Super class constractor");
	
	}
	
	String carname;
	double weight;


    Learning_Super(String c, double w) {
	carname =c;
	weight = w;
    }
    
    void carinfo() {
	System.out.println("Cartype is:" + carname );
	System.out.println("Car weight is:" + weight);
    }
}