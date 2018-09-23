package Learning_Access_Modifier;

  //Java provides a number of access modifier for classes, variables, methods and constructor.
  //They are Default, public private and protected
  
public class Learning_Access_Modifier {
	//For class is default and public only. Default( No Public or private or protected)
    //Default is only available inside the same package and cannot be imported to a different Package.
	//Public is visible to everybody.

	int day= 1;
    //Dfault. Visible to the same package.No other package can access it. No modifiers needed.
	public int week = 2;
	//Public. Visible to everybody
     private int month =3;
	//Visible to the class only and cannot be access to anyother subclss and same and different package.
	protected int year = 4;
	//visible to the package and only subclass
 	
	public int Printweek() {//Methods use all four
		 //Default is only available inside the same package and cannot be imported to a different Package. 
		//Public. Visible to everybody
		//Private. Visible to the class only and cannot be access to anyother subclss and same and different package.
		//Protected. Visible to the package and only subclass
		return day+week+month+year;
	
	}
	private void display() {
		//Private Method only can use in this class only. Can't call it. (abc.display).
		//Public can access from same package or different package
		//Protected can access in same package
		//Protected can access in different package but need to inherit.
		//default  - can use only in same package.
		}
	
	

	}


