package practice;

import java.util.*;
import java.util.ArrayList;

public class ArrayList3 {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		
		System.out.println("ArrayList Bafore Operation :" +list);
		
		boolean b=Collections.addAll(list, "1","2","3");
		
		System.out.println("result :" +b);
		
		System.out.println("ArrayList After Operation :"+list);
		
		List<Object> list1=new ArrayList<>();
		list1.add(0, "e1");
		System.out.println(list1);
		list1.add(1);
		System.out.println(list1);
		list1.add(1, "e2");
		System.out.println(list1);
		list1.add(0, 1);
		System.out.println(list1);
	}

}
