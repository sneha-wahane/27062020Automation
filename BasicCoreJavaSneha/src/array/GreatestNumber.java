package array;

public class GreatestNumber {
	public static void main(String[] args)
	//Find the greatest number in a array
	{
		int[]num= {1,11,44,78,113,16,90};
		int max= num[0];
		
		for(int i=1; i<num.length;i++)
		{
			if(max<num[i])
			{
				max=num[i];
			}
		}
		System.out.println(""+ max);
	}

}
