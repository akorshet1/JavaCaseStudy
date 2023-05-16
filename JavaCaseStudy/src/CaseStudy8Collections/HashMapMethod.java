package CaseStudy8Collections;

import java.util.HashMap;

public class HashMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		hmap.put(1,"Pune");
		hmap.put(4,"Mumbai");
		hmap.put(3,"Bangalore");
		hmap.put(43,"Kolkata");
		hmap.put(54,"Chennai");
		hmap.put(6,"Hyderabad");
		
		System.out.println(hmap);
		
		System.out.println(hmap.get(3));
		
		hmap.clear();
		System.out.println(hmap.isEmpty());
		
		
		

	}

}
