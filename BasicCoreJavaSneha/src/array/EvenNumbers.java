package array;

public class EvenNumbers {

	public static void main(String[] args) {
		//Write a for loop to print even numbers between 1 to 100

		int n=100;
		System.out.println("even nos from 1 to "+n+" are:");
		
		for(int i=1; i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
			}
		}
		
	}

}
