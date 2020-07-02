package ifElseSttements;

public class IfElseClass1LogicalOperators {
	public static void main(String[] args)
	{
		boolean graduate=true;
		int marks=350;
		if(marks>=150 && graduate)
		{
			System.out.println("you are eligible");
		}else {
			System.out.println("you are not eligible");
		}
		boolean cheque=true;
		boolean cash =true;
		int limit=10000;
		if(cheque||cash &&  limit<=100000)
		{
			System.out.println("you are eligible for a payment");
		}
		else {
			System.out.println("you are not eligible for a payment");
		}
				
	}

}
