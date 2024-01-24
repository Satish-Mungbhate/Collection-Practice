package practice;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExam {

	public static void main(String[] args) {
		SortedMap<String, Integer> n = new TreeMap<>();

        // Insert elements to map
        n.put("Two", 2);
        n.put("One", 1);
        n.put("Three",3);
        n.put("Four",4);
        n.put("Five",5);
        n.put("Six",6);
        System.out.println("SortedMap: " + n); //sorting based on asecneding order //
        System.out.println("First Key: " + n.firstKey());
        System.out.println("Last Key: " + n.lastKey());
        int value = n.remove("One");
        System.out.println("Removed Value: " + value);

	}

}