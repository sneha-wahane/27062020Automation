package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		try {
			/*System.out.println(" disconnect");
			System.out.println(10/0);
			System.out.println("sneha");
			System.out.println("close the connection");*/
			System.out.println("open the database connection");
			System.out.println("verify that xxxxxxxxxx1234");
			System.out.println(10/0);
			//System.out.println("connect the machine to the internet");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			//System.out.println("connect the machine to the internet");
		}finally {
			System.out.println("connect the machine to the internet");
		}
		}

	}


