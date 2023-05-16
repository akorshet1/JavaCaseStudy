package CaseStudy8Collections;

import java.util.TreeMap;
public class TreeMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		tmap.put(1,"Pune");
		tmap.put(2,"Mumbai");
		tmap.put(43,"Bangalore");
		tmap.put(34,"Kolkata");
		tmap.put(55,"Chennai");
		tmap.put(6,"Hyderabad");
		
		System.out.println(tmap);
		
		System.out.println(tmap.get(43));
		
		tmap.clear();
		System.out.println(tmap.isEmpty());

	}

}
