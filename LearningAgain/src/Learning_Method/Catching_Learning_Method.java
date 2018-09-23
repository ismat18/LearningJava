package Learning_Method;

public class Catching_Learning_Method {

	public static void main(String[] args) {
		
		Learning_Method abc = new Learning_Method();
		abc.name = "Pavel";
		abc.age = 42;
		abc.display();//calling the method to print
		
		//System.out.println(abc.name);//print it here
		
		Learning_Method def = new Learning_Method();
		def.Gender = "Male";
		def.dob = 01;
		
		//print here
		System.out.println(def.Gender);
		System.out.println(def.dob);
		
		
	
		
		
		//Parameterized Method
		Learning_Method ijk = new Learning_Method();
		ijk.setinfo("Ruhel",45);
		ijk.result();
		
	//	Learing_Method t = new Learing_Method("Anupom", 50);//Constructor. Passing the parameter in object
		
	}

}
