package practice;

import java.util.Iterator;
import java.util.Vector;

public class Vector2 {
	
	public static void main(String[] args) {
		Vector<String> animals=new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("CAt");
		
		System.out.println("initial vector : "+animals);
		
		String element=animals.get(1);
		System.out.println("element at inde 1 :"+element);
		
		Iterator<String> iterate= animals.iterator();
		System.out.print("Vector :");
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

}
