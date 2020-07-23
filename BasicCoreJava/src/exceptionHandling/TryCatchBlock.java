package exceptionHandling;

public class TryCatchBlock {
	public static Functions fun=new Functions();
	public static void main(String[] args) {
		try
		{
		//step 1:verify about link is present
			int a=10;
			int b=0;
			System.out.println(a/b);
		}catch(Exception e)
		{
			System.out.println("Exception occurred:"+e.getMessage());
		}
			
			//step 2:verify downloads link is present
		try {
			String[] str=new String[2];
			str[2]="sneha";
		}catch(Exception e)
		{
			System.out.println("Exception occurred:"+e.getMessage());
		}
			
			//step 3:verify project link is present
			fun.fun1();
}}
