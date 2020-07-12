package array;

public class LeastNumber {
	static void least(int a[], int n)
	{
		
		int min;
		
		for(int i=0; i<n;i++)
		{
			for(int j=i+1; j<n;j++)
			{
				if (a[i] > a[j])   
                {  
                    min = a[i];  
                    a[i] = a[j];  
                    a[j] = min;  
                }  
			}
		}
		
		
		
	}

		  

		public static void main(String[] args)
	    {
		    int [] a = {10, 60, 30, 44, 50}; 
		    
	       System.out.println(""+a[5]);
	    }

}
