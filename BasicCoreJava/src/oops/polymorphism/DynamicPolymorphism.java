package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		//SmartPhone obj =new SmartPhone();
		//reference    //object
		/*Mobile obj2=new SmartPhone();
		SmartPhone obj1 =new SmartPhone();
		Telephone obj3=new Telephone();*/
		Telephone obj4=null;//WebDriver
		/*obj4=new Telephone();
		obj4.calling();
		obj4.calling();*/
		String browsername="Chrome";
		if(browsername.equals("Chrome"))
		{
			obj4 =new Mobile();//ChromeDriver
		}else if(browsername.equals("FireFox"))
		{
			obj4=new SmartPhone();//FireFoxDriver
			
		}
		//Script start
		obj4.calling();
	}

}
