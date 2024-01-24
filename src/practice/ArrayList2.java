package practice;

import java.util.*;

public class ArrayList2 {
	
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);
		
		for(String fruit:list)
		System.out.println(fruit);
	
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("red");
		System.out.println(colors);
		colors.add("blue");
		System.out.println(colors);
		colors.add(1, "white");
		System.out.println(colors);
		colors.add(0, "black");
		System.out.println(colors);
	}

}
