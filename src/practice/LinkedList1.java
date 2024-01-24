package practice;

import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		LinkedList<String> animals=new LinkedList<String>();
		animals.add("cat");
		animals.add("Dog");
		System.out.println("The LinkedList is:"+animals);
		animals.addFirst("elephant");
		System.out.println("updated LinkedList is :"+animals);
		animals.addLast("rat");
		System.out.println("updated LinkedList is :"+animals);
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		animals.removeFirst();
		System.out.println("updated LinkedList is :"+animals);
	}

}
