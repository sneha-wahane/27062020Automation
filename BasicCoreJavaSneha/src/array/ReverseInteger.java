package array;

public class ReverseInteger {
	//Make an integer array. Write a for loop to print the integer array in reverse.
	 /*static void reverse(int a[], int n) 
	    { 
	        int[] b = new int[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) 
	        { 
	            b[j - 1] = a[i]; 
	            j = j - 1; 
	        } 
	        System.out.println("Reversed array is: \n"); 
	        for (int k = 0; k < n; k++) 
	        { 
	            System.out.println(b[k]); 
	        }
	        } 
   public static void main(String[] args)
    {
	    int [] arr = {10, 20, 30, 40, 50}; 
       reverse(arr, arr.length); 
    }
	*/
	public static void main(String[] args)
	{
		int[] num= {10,20,30,40,50,60};
		System.out.println("Reversed array is:" ); 
        
        for (int i=num.length-1;i>=0;i--) 
        { 
        	System.out.println(num[i]+"");
        }
        
        
		
		
	}
}
