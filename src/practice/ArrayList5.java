package practice;

import java.util.*;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		
		System.out.println("ArrayList elements :"+al);
		System.out.println("Returning element :"+al.get(1));
		
		Object[] obj=al.toArray();
		System.out.println("Array :");
		for(Object value:obj)
		System.out.println(value);
	}

}
