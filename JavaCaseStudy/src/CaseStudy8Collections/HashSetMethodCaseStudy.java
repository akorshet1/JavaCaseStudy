package CaseStudy8Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethodCaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hset=new HashSet();
		
		hset.add("java");
		hset.add("C++");
		hset.add("DATABASE");
		hset.add("Notepad");
		hset.add("Notepad++");
		hset.add("Phyton");
		
		System.out.println(hset.size());
		
		System.out.println(hset);
		
		Iterator it=hset.iterator();
		
		while(it.hasNext()) {
			
			String s=(String) it.next();
			
			System.out.println(s);
			
		}
		
		hset.clear();
		
		System.out.println(hset.isEmpty());
		
		
		

	}

}
