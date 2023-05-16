package CaseStudy8Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedHashSetMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Solapur");
		list.add("Kolapur");
		list.add("Pandarpur");
		list.add("Bangalore");
		list.add("Pune");
		
		LinkedList<String> list1=new LinkedList<String>();
		list1.addAll(list);
		System.out.println("Adding Element  = " +list1);
		
		System.out.println(list1);
		
		list1.removeAll(list);
		System.out.println("Removing Element = " +list1);
		
		
		//Sorting Collection
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After Sorting = " +list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Element is linked after sorting in reverse order = " +list);
		
		//Shuffling Collections
		
		Collections.shuffle(list);
		System.out.println("Element in the linked list after shuffling = " +list);
		}

	}

