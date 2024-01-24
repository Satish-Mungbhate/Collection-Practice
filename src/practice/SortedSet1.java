package practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
	
	public static void main(String[] args) {
		SortedSet<Integer> set= new TreeSet<>();
		set.add(101);
		set.add(104);
		set.add(106);
		set.add(110);
		set.add(115);
		set.add(120);
		
		System.out.println("The list of elements is given as :");
		for(Object object:set)
			System.out.println(object);
		
		System.out.println("The First element is given as :"+set.first());
		
		System.out.println("The Last element is  given as :"+set.last());
		
		System.out.println("The respevtive element is given as :"+set.headSet(106));
		
		System.out.println("The Respective element is given as :"+set.tailSet(106));
		
	}

}
