package Learning_Method;

public class Catching_Method_Over_Loading extends Learning_Method_Over_Loading{

	public static void main(String[] args) {
		Learning_Method_Over_Loading P1 = new Learning_Method_Over_Loading();
		P1.sum();
		P1.sum(10);
		P1.sum("Hello");
		P1.sum(10,10);
		System.out.println(P1.sum(10,10));
		P1.sum(30,"Life");
		System.out.println(P1.sum(30,"Life"));
		P1.sum("rose",60);
		System.out.println(P1.sum("rose",60));

	}

}
