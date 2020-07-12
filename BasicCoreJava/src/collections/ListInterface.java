package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("puja");
		list.add("sneha");
		list.add("puja");
		list.add("nitu");
		for(String s:list)
		{
			System.out.println(s);
		}
		List<String> lis=new LinkedList<>();
		List<String> lit=new Vector<>();
	}

}
