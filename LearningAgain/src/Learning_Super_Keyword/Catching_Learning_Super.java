package Learning_Super_Keyword;

public class Catching_Learning_Super {

	public static void main(String[] args) {
		
		Learning_Super_1 P1 = new Learning_Super_1();
		P1.display();//For instance variable
		P1.hiprint();//for Overridden Method
		
		Learning_Super_1 P2 = new Learning_Super_1("Lambo", 435.0,6);
		P2.carinfo();

	}

}
