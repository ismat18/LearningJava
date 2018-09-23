package Learning_Inheritance;

public class Catching_Inheritance{

	public static void main(String[] args) {
		
		//OOPS Concept - Encapsulation , Inheritance , Polymorphism , Abstraction
		
		Inheritance P1 = new Inheritance();
		P1.age =40;
		P1.name = "Pavel";
		P1.show();
		
		//P1.dob - Need to understand
		
		Inheritance_1 P2 = new Inheritance_1();
		P2.name = "Ruhel";
		P2.age = 30;
		P2.address = "303 camp wisdom road";
		P2.display();
		
		P2.setHeight(8);
		P2.setQualification("Bachelor");
		
        System.out.println(P2.getHeight());
        System.out.println(P2.getQualification());
		
		
	}

}
