package array;

public class AlternateElements {

	public static void main(String[] args) {
	// Print alternate elements of String array array
		int[]num= {10,20,11,22,30,33,40,44};
		
		System.out.println("Alternate elementes of array:");
		for(int i=0;i<num.length;i+=2)
		{
			System.out.println(num[i]+"");
		}
	}

}
