package Learning_Super_Keyword;

public class Learning_Super_1 extends Learning_Super{
	//int x =10 - came from Super class
	// hiprint Method came from Super class
	
	int x =5;
	
	void display() {
		System.out.println(x);//it will give the priority for this class(x = 5)
		System.out.println(super.x);//calling super class variable
		
	}
        void hiprint() {
        super.hiprint(); // calling super class method
		System.out.println("Sub class Method");//will print for this class
	}
        
        Learning_Super_1(){
        	super();//calling super class default Constructor.
    		System.out.println("Sub class constractor");
    	
    	}   

	//Carname, Weight and display Method is here because extended
        int gear;
        
        Learning_Super_1(String c, double w, int g){
        	super(c,w);//calling the super class overriden parameterized Constructor
        	gear = g;
        }
        
        void carinfo() {
          	super.carinfo();//calling Super class Method. overridden Method
          	System.out.println("There are" + " "+ gear +" "+ "gears");
          	
        }
        
        
        
}
