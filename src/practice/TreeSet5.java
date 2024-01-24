package practice;

import java.util.TreeSet;

public class TreeSet5 {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		//numbers.add(null);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        //numbers.add("A");
        
        System.out.println("TreeSet: " + numbers);

     
        System.out.println("Using higher: " + numbers.higher(4));

        System.out.println("Using lower: " + numbers.lower(4));

        System.out.println("Using ceiling: " + numbers.ceiling(4));

        System.out.println("Using floor: " + numbers.floor(3));
        
        System.out.println("Using headSet value: " + numbers.headSet(5));
        
        System.out.println("Using tailSet value: " + numbers.tailSet(4));
        
        System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));

	}

}