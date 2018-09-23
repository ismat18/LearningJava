package Learning_Again;

public class Variables {

	public static void main(String[] args) {
	
		/*Byte
		 * Min: -128
		 * Max: 127
		 * Default 0
		 */
 byte ByteVariable = 100;//Dynamic Initialization
 System.out.println("Byte Value: " + ByteVariable);
		
	/*Short
	 * Min: -32, 768
	 * Max: 32, 767
	 * Default: 0	
	 */
		short ShortVariable = 1000;
		 System.out.println("Short Value: " + ShortVariable);
	
    /*Int
     * Min: -2,147,483,648
     * Max: 2, 147, 483, 647
     * Default = 0
     */
	int IntegerVariable = 10000;
	 System.out.println("Int Value: " + IntegerVariable);
	
	 /*Long
	 * Min: -2^63
	 * Max: 2^63 - 1	 
	 */
	long LongVariable = 100000L;
	 System.out.println("Long Value: " + LongVariable);
		 
	 /*Float
	  * Default: 0.0f
	  */
	 float FloatVariable = 10.0f;
	 System.out.println("Float Value: " + FloatVariable);
	
	/*
	 * Double
	 * Default: 0.0d
	 */
	
	double DoubleVariable = 20.98;
	 System.out.println("Double Value: " + DoubleVariable);
	
	/*
	 * boolean
	 * false and true
	 * Default: false
	 */
	
	boolean BooleanVariable = true;
	 System.out.println("Boolean Value: " + BooleanVariable);
	 
	 /*char
	  * Min: 0
	  * Max: 65, 535
	  */
	char CharVariable = 'a';
	 System.out.println("Char Value: " + CharVariable);
	
	
	
	}

}
