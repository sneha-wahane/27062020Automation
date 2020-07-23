package functions;

public class NonStaticMethods {

	public  String name="sneha";
	public static String name2="puja";
	public static void main(String[] args) {
		
		NonStaticMethods obj=new NonStaticMethods();
		System.out.println(obj.name);
		System.out.println(obj.name2);
	}

}
