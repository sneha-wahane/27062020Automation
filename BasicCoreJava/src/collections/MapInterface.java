package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<>();
		map.put("name", "sneha wahane");
		map.put("email", "rani.wahane10@gmail.com");
		map.put(null,"jgjhjgh");

		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		System.out.println(map.get(null));
		
		
		
}

}
