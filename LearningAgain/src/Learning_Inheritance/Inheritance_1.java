package Learning_Inheritance;

public class Inheritance_1 extends Inheritance{
	
	private String qualification;
	
    
    
	
	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	String address;
	
	
	//Override the Method
//	void show() {
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(address);
//	}
	
	//inherited name and age
	void display() {
		System.out.println(address);
		System.out.println(name);
		System.out.println(age);
	}
	
	

}
