package Learning_Break_Continue;

public class Break_Continue {

	public static void main(String[] args) {
		for(int i =1; i<10;i++) {
			
			if(i==5)
			break;
			System.out.println(i);
		}
        
		for (int x = 1; x<15;x++) {
			
			if (x==9)
				continue;
			System.out.println(x);
		}
	}

}
