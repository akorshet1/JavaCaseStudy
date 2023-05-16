package CaseStudy8Collections;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tset= new TreeSet<String>();
		
		tset.add("Virat");
		tset.add("Dhoni");
		tset.add("Sachin");
		tset.add("Rohit");
		tset.add("Surya");
		
		System.out.println(tset.size());
		
		for(String Player : tset) {
			
			System.out.println(Player);
						
		}
		
		tset.clear();
		System.out.println(tset.isEmpty());

	}

}
