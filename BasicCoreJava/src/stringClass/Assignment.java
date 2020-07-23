package stringClass;

public class Assignment {

	public static void main(String[] args) {
		//how many 'a' are present in this string
		String str="anand";
		/*int count=0;
		for(int iter=0;iter<str.length();iter++)
		{
			if(str.charAt(iter)=='a'||str.charAt(iter)=='A')
			{
				count++;
			}
		}
		System.out.println(count);*/
		String[]arr=str.split("");
		int count=0;
		System.out.println(arr.length);
		for(String c:arr)
		{
			if(c.equals("a"))
				count++;
			
		}
		System.out.println("Total number of a="+count);
	}

}
