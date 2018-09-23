package Learning_Constructor;

public class Catching_Learning_Constructor {

	public static void main(String[] args) {
		
		
//		Learning_Constructor P1 = new Learning_Constructor();
//		P1.name="Pavel";
//		P1.age = 10;
//		P1.ola();
//		
//		Learning_Constructor P2 = new Learning_Constructor();
//		P2.what("NewYork", 20);
//		P2.hello();
		
		Learning_Constructor a = new Learning_Constructor();
		int result = a.squre(5);
		System.out.println(result);
		
		Learning_Constructor p3 = new Learning_Constructor();
		Learning_Constructor p4 = new Learning_Constructor(10);
		Learning_Constructor p5 = new Learning_Constructor("Hello");
		Learning_Constructor p6 = new Learning_Constructor("Dallas", 40);
		
		
        
	}

}
