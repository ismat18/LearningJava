package Learning_Again;

public class Break_Continue {


	public static void main(String[] args) {
		
//		
//		for (int i=0; i<20; i=i+2) {
//		
//		if(i==10) 
//			break;
//		System.out.println(i);
		
		//}
		for (int x=1; x<=20; x = x+3) {
			if (x==10)//condition matched. So will not print 10.
				continue;
			System.out.println(x);
		}

	}

}
