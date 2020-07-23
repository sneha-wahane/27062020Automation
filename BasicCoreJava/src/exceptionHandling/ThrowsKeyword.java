package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		
	}
	
	public static void test2() 
	{
		//To declared exception
		try {
			FileInputStream file = new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*public static void test3(int age)
		{
			if(age>18)
			{
				System.out.println("you are eligible");
			}
			else
			{
				throw new Exception("your age is below 18");
			}
		}*/
		test2();

		test3(); //doesnt throw error bacz unchecked excptn, hence throws is not used with unchecked / runtime excptns

		//test4(); // will show error becz it throws checked excptn
		}

		public static void test() throws FileNotFoundException { // Declare the checked exception

		FileInputStream file = new FileInputStream(
		"D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		}

		

		

		public static void test3() throws ArithmeticException { // throws doesnt give error to user test3();

		}

		//public static void test4() throws IOException {

		}
	


