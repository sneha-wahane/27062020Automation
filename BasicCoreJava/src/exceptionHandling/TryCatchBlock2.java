package exceptionHandling;

public class TryCatchBlock2 {
	public static Functions fun;
	public static void main(String[] args) {
		try
		{
		//step 1:Download link 
			int a=10;
			int b=1;
			System.out.println(a/b);
		
			
			//step 2:click on latest stable version
			String[] str=new String[2];
			str[1]="sneha";
		
			
			//step 3:verify something
			fun.fun1();
		}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException occurred:"+e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("ArrayIndexOutOfBoundsException occurred:"+e.getMessage());
			}catch(NullPointerException e)
		{
				System.out.println("NullPointerException occurred:"+e.getMessage());
			}catch(Exception e)
		{
				System.out.println("Exception occurred:"+e.getMessage());
			}
		
}}
