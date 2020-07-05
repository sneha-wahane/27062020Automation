package array;

public class Array1 {

	public static void main(String[] args) {
		String name = "Ajinkya";
		String name1 = "Prachee";
		String name2 = "Amit";

		String[] std = new String[10];
		std[0] = "Sneha";
		std[1] = "Itishri";
		std[2] = "Pratik";
		std[3] = "Anand";
		std[4] = "Aklesh";
		std[5] = "Puja";
		std[6] = "Bilwa";
		std[7] = "Prachee";
		std[8] = "Dhara";
		std[9] = "Nitu";

		System.out.println(std[0]);
		System.out.println(std[7]);
		System.out.println(std[8]);
		System.out.println(std.length);
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i]);
		}

	}

}
