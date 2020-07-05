package functions;

public class CallVariables {

	public static void main(String[] args) {
		System.out.println(Variables.name);
		Variables.name="Prachee";
		Variables ref=new Variables();
		System.out.println(ref.name2);
		ref.name2="Bilwa";
		Variables ref2=new Variables();
		System.out.println(Variables.name);
		System.out.println(ref2.name2);
		System.out.println(ref.name2);
		

	}

}

