package stringClass;

public class TestString {

	public static void main(String[] args) {
		String str="Selenium";
		//1st function-length
		System.out.println(str.length());
		//2nd function-charAt
		char c=str.charAt(3);
		System.out.println(c);
		//3rd function-toUpperCase
		System.out.println(str.toUpperCase());
		//4th function-toLowerCase
		System.out.println(str.toLowerCase());
		//5th function-Replace
		System.out.println(str.replace("len", "123"));
		//6th function-subString
		System.out.println(str.substring(4));
		//7th function-substring
		System.out.println(str.substring(2, 5));
		//8th function-split
		String[]arr=str.split("len");
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		//EqualsString str2="anand";
		String str2="selenium";
		System.out.println(str.equals(str2));
		
		//EquqlIgnoreCase
		System.out.println(str.equalsIgnoreCase(str2));
	}

}
