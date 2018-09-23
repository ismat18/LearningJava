package Learning_Again;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
//		
        Scanner abc = new Scanner(System.in);
        char VC;
        
        System.out.println("Enter the letter");
        
        VC = abc.next().charAt(0);
        
        if (VC == 'a' || VC =='e' || VC == 'i' || VC =='o' || VC == 'u') {
        	System.out.println("Vowel");
               	
        }else {
        	System.out.println("Something else");
        }
        
        System.out.println("Enter Letter");
        VC = abc.next().charAt(0);
        
        if (VC >= 'a' && VC <= 'z') {
        	System.out.println("Small Letter");
        }
        else if (VC>='A'&& VC<='Z') {
        	System.out.println("CAPITAL LETTER");
        }else {
        	System.out.println("Integer");
        }
        
        	
        
        
        
        
        
        
        
        
//		int x = 20;
//		System.out.println("Enter the first integer: ");
//		x =abc.nextInt();
//		if (x == 10) {
//			System.out.println("False");
//		}else if(x>=30) {
//			System.out.println("still wrong");
//		}else if(x<=20){
//			System.out.println("True");
//		}else {
//			System.out.println("Don't know");
//		}
//		
//		int boy=20;
//	    int girl=30;
//	    
//	    if (boy>21 && girl<=28) {//And
//	    	System.out.println("True");
//	    }else if(boy>19 || girl>34  ){//Or
//	    	System.out.println("Still true");
//	    }else {
//	    	System.out.println("Don't know");
//	    }
	 
	 
//	
//	
//	 
//	 int score = 85;
//	 String grade;
//	 
//	 if (score>90) {
//	  grade = "A";
//	 }
//	 else if (score>80) {
//		 grade = "B";
//	 }
//	 else if (score>70) {
//		 grade = "C";
//	 }
//	 else {
//		 grade ="D";
//	 }
//	 
//	 System.out.println("Score is: " + score);
//	 System.out.println("Grade is: "+ grade);
//	 
}

}
