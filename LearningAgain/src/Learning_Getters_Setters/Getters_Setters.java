package Learning_Getters_Setters;

public class Getters_Setters {

	//Encapsulation is packaging variables and Methods into a single unit
		
	//Can access the private variable by creating a method
	private int age=27;
	public int result() {
		return age;
	}

	//OR Use Gettes and Setters
	
	private String name;
	private int year =2017;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setYear(int year) {
		this.year = year;
	}	
	
	public int getYear() {
		return year;
	}

	
	
	
	
	
	

}
