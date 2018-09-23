package Learning_Again;

public class Catching_Learning_Interface implements Learning_Interface {

	//int age;
	private int number;
	int numb = 30;
	
	public static void main(String[] args) {
	Catching_Learning_Interface abc = new Catching_Learning_Interface();
		//abc.age=12;
		
		System.out.println(abc.age(12));
		
		abc.number=5;
		System.out.println(abc.num());
		
		abc.zipcode();
		System.out.println(abc.zipcode());
		
		abc.numberVales();
		System.out.println(abc.numberVales());
		
		abc.name();
		System.out.println(abc.name());
		
		
	}
	
	public int age(int age) {
		return age;
	}
	public int zipcode() {
		return 75063;
	}
	
	public int num() {
		return number;
	}
	public int numberVales() {
		return numb;
	}
	public String name() {
		return "Paul";
	}

}
