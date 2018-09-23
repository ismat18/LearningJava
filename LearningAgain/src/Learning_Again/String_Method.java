package Learning_Again;


public class String_Method {

	public static void main(String[] args) {
		
		//String'length() " length of the string
		String str = "My name is Pavel";
		System.out.println("Testing Length: " + str.length());
		
		//String'charAt() " returns a char value at the given index number
		String str1 = "My name is Pavel";
		System.out.println("Value of the carecter: " + str1.charAt(5));
		
		//String'concat() " combines specified string at the end of this string
		String str2  = "My name is pavel";
		System.out.println("Combine two string: " + str2.concat(". My wife's name is Anny"));
		
		//String'contains() " returns true if chars are found in the string
		String str3  = "My name is pavel";
		System.out.println("Returns True if the value exist: " + str3.contains("My"));
		System.out.println("Returns False if value does not exist: "+ str3.contains("are"));
				
		//String'startsWith() " checks if this string starts with given prefix
		String str4  = "My name is pavel";
		System.out.println("starts character True: "+ str4.startsWith("My"));
		System.out.println("starts character False: " + str4.startsWith("You"));
		
		//String'endsWith() " checks if this string ends with given suffix
		String str5  = "My name is pavel";
		System.out.println("End character True: " + str5.endsWith("pavel"));
		System.out.println("End character False: "+ str5.endsWith("Anny"));
		
		//String'equals() " compares the contents of two given strings
		String str6 = "Hello";
		String str7 = "Hello";
		String str8 = "Welcome";
		System.out.println("Contents are equal True: " + str6.equals(str7));
		System.out.println("Contents are equal True: " + str6.equals(str8));
				
		//String'indexOf() " returns index of given character value or substring
		String str9  = "My name is pavel";
		System.out.println("Index of character: " + str9.indexOf('M'));
		System.out.println("Index of character: " + str9.indexOf('m'));
		System.out.println("Index of character: " + str9.indexOf('b'));
		
		//String'isEmpty() " checks if this string is empty
		String str10  = "My name is pavel";
		System.out.println("Check string is empty False: " + str10.isEmpty());
		String str11  = "";
		System.out.println("Check string is Empty True: " + str11.isEmpty());
		
		//String'replace() " replacing all the old char to new char
		String str12 = "Zahin is my son";
		System.out.println("Replace a character inside string: " + str12.replace('a', 'e'));
		
		//String'substring() " returns a part of the string
		String str13 = "My name is Pavel";
		System.out.println("Beginning Index: " + str13.substring(3));
		System.out.println("Ending Index: " + str13.substring(3, 16));
		//String'toCharArray() " converts this string into character array
		
		
		//String'toLowerCase() " returns the string in lowercase letter
		String str14 = "My name is Pavel";
		System.out.println("Make Lower case: "+ str14.toLowerCase());
		
		//String'toUpperCase() " returns the string in Uppercase letter
		String str15 = "My name is Pavel";
		System.out.println("Make Uper Case: " + str15.toUpperCase());
		
		//String'trim() " eliminates leading and trailing spaces
		String str18  = "   My name is pavel  ";
		System.out.println("Eliminates leading and trailing spaces: " + str18.trim());
		
		
		//Split - 
		String str19  = "ballallallal b@ghg gfgf gfgf ggf";
		String[] abc = str19.split("f");
		System.out.println(abc[0]);
		
		//Swap
		
		
		
	}

}
