package functions;

public class ReturnType {
	public static String name="Prachee";//global variable
	public static void main(String[] args) {
		int add=sum(10,20);
		System.out.println(add); 
		boolean c=eligible(10);
		if(c)
			
		{
			System.out.println("you are eligible");
		}else
		{
		System.out.println("you are not eligible");
		}
		System.out.println(name);
	}
	public static int sum(int a, int b)
	{
		return a+b;
	}
	public static boolean eligible(int age)
	{
		if(age>=18)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
