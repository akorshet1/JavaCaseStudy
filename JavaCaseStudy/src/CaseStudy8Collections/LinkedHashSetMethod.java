package CaseStudy8Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(50);
		lset.add(60);
		
		
		System.out.println(lset.size());
		
		for(int s : lset) {
		System.out.println(s);
		
		}
		lset.clear();
		
		System.out.println(lset.isEmpty());

	}

}
