package array;

public class GreatestNumber {
	public static void main(String[] args)
	{
		int[]num= new int[100];
		int max= num[0];
		
		for(int i=1; i<=100;i++)
		{
			if(max<i)
			{
				max=i;
			}
		}
		System.out.println(""+ max);
	}

}
