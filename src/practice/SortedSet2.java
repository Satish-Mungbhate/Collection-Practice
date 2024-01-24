package practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet2 {
	
	public static void main(String[] args) {
		SortedSet<Integer> numbers=new TreeSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		System.out.println("SortedSet :"+numbers);
		
		int FN=numbers.first();
		System.out.println("First Number :"+FN);
		
		int LN=numbers.last();
		System.out.println("Last Number :"+LN);
		
		boolean result=numbers.remove(2);
		System.out.println("is the number 2 removed ? :"+result);
	}

}
