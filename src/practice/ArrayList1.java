package practice;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("initial sise of ArrayList is "+al.size());
		al.add("Hii");
		al.add("hello");
		System.out.println("ArrayList is "+al);
		System.out.println("New size of ArrayList is "+al.size());
		al.add(1,"how are you");
		System.out.println("ArrayList is set "+al);
		al.set(1, "dates");
		System.out.println("New ArrayList is "+al);
		System.out.println("New size of ArrayList is "+al.size());
		
		ArrayList list=new ArrayList();
		list.add("element1");
		list.add(Boolean.TRUE);
		list.add("last element");
		System.out.println(list);
	}

}

