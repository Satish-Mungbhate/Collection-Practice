package practice;

import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

     
        int first = numbers.first();
        System.out.println("First Number: " + first);

        
        int last = numbers.last();
        System.out.println("Last Number: " + last);

        System.out.println("New TreeSet: " + numbers);

   
        System.out.println("Removed First Element: " + numbers.pollFirst());

       
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);
        
        
	}

}
