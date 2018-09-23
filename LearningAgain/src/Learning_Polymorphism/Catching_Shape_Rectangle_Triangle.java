package Learning_Polymorphism;

public class Catching_Shape_Rectangle_Triangle {

	public static void main(String[] args) {
		
		Shape s = new Shape();
				
		Rectangle r = new Rectangle(10,20);
		
		Triangle t = new Triangle(5,10);
		
		
		System.out.println(s.area());
		System.out.println(r.area());
		System.out.println(t.area());
		
		System.out.println("-----------------------------------");
		//or
		
//		Shape s1 = new Shape();
//		Shape s2 = new Rectangle(5,10);
//		Shape s3 = new Triangle(10,20);
//		
//		
//		System.out.println(s1.area());
//		System.out.println(s2.area());
//		System.out.println(s3.area());
		
		//or
		
		
		Shape[] s1 = new Shape[3];
		s1[0] = new Shape();
		s1[1] = new Rectangle(5,10);
		s1[2] = new Triangle(10,20);
		
		System.out.println(s1[0].area());
		System.out.println(s1[1].area());
		System.out.println(s1[1].area());
		
		//or 
		System.out.println("----------------------------------");
		
		for(int i=0;i<3;i++) {
			System.out.println(s1[i].area());
		}
		
	}

}
