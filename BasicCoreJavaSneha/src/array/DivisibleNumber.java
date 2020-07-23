package array;

public class DivisibleNumber {

	public static void main(String[] args) {
		//Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 
		//'divisble by 5 followd by that number'
		
		int num[]= new int [100];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]%5==0)
				System.out.println(num[i]);
				
		}

	}

}
