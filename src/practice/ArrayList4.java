package practice;

import java.util.*;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("MAngo");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		System.out.println("List is :"+list);
		
		boolean result=list.contains("Apple");
		System.out.println("is Apple present in the List :"+result);
		
		list.clear();
		System.out.println("The new list is :"+list);
	}
}
