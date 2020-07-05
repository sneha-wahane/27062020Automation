package functions;

public class Function2 {

	public static void main(String[] args) {
		
		sum(10,20);
		sum(40,50);
		sum(10,20,30);
		message("Sneha");
		eligibility("Sneha",32);
		eligibility("neha",17);
	}
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void message(String name)
	{
		System.out.println("Welcome" +name);
	}
	public static void eligibility(String name, int age)
	{
		System.out.println("Sneha, you are eligible");
		System.out.println("prachee, you are not eligible");
	}
	

}
