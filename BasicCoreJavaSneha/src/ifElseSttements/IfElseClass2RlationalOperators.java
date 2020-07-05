package ifElseSttements;

public class IfElseClass2RlationalOperators {
	public static void main(String[] args)
	{
		int a=10;
		int b=50;
		int c=100;
		int d=500;
		int e=1000;
		if(a>b)
		{
			System.out.println("a is greater than b");
		
		}else {
			System.out.println("a is less than  b");
		}
		if(a<=b && c!=d)
		{
			System.out.println("a is less than equal to b");
		}
		if(d<e ||c>=a)
		{
			System.out.println("d is less than e");
		}
		if(c==e)
		{
			System.out.println("c is equal to e");
		}
		else
		{
			System.out.println("c is not equal to e");
		}
	}

}
