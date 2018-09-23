package Learning_Polymorphism;

public class Catching_Learning_Polymorphism {

	public static void main(String[] args) {
		Person P1 = new Person();
		P1.display();
		
		Student S1 = new Student();
		S1.display();
		
		Teacher T1 = new Teacher();
		T1.display();
				
		//or
		
		//Run Time Polymorphism or Dynamic Method Dispatch
		Person p = new Person();//super class reference variable (p) is refering to subclass object(Teacher())
		p.display();
		
		p = new Teacher();
		p.display();//calling Teacher class display method
		
		p = new Student();//super class reference variable (p) is refering to subclass object(Student())
		p.display();//calling the Student class display method
		
		

	}

}
