package array;

public class LeastNumber{
	//Find the least number in a array
	public static void main(String[] args)
	{
	int[] arr = {2,11,44,78,113,16,90};
	int min=arr[0];
	
	for(int i=1; i<arr.length;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
	System.out.println(""+ min);
}
}
