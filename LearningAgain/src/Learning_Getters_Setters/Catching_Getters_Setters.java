package Learning_Getters_Setters;

public class Catching_Getters_Setters {

	public static void main(String[] args) {
		Getters_Setters ab = new Getters_Setters();
		ab.result();
		System.out.println(ab.result());
		
		
		//Getters and Setters
		ab.setName("Paul");
		ab.getName();
		System.out.println(ab.getName());
		
		//Don't need to use set Methos
		ab.getYear();
		System.out.println(ab.getYear());
		
		ab.setYear(2020);//Over rididng the year
		ab.getYear();
		System.out.println(ab.getYear());

}


}