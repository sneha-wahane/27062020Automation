package functions;

public class CallVariables2 {

	public static void main(String[] args) {
		System.out.println(Variables2.name);
		
		
		Variables2 ref=new Variables2();
		ref.name="Sneha";
		ref.a=20;
		Variables2 ref2= new Variables2();
		System.out.println(ref2.name);
		System.out.println(ref2.a);
		
		System.out.println(ref.name);
		System.out.println(ref.a);
		
		
		
		
	}

}
