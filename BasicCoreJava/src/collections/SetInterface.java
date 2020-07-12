package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("puja");
		set.add("bilwa");
		set.add("prachee");
		set.add("puja");
		for(String s:set)
		{
			System.out.println(s);
		}
		Set<String> set1=new TreeSet<>();
		set1.add("puja");
		set1.add("bilwa");
		set1.add("prachee");
		
		for(String s:set1)
		{
			System.out.println(s);
		}
		Set<String> set2=new LinkedHashSet<>();
		set2.add("puja");
		set2.add("bilwa");
		set2.add("prachee");
		set2.add("puja");
		for(String s:set2)
		{
			System.out.println(s);
		}
		Iterator<String>it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
