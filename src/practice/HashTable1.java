package practice;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht1 = new Hashtable<>();
        
        ht1.put(5, "A");
        ht1.put(2, "B");
        ht1.put(6, "C");
        ht1.put(15, "D");
        ht1.put(23, "E");
        ht1.put(16, "F");
 
        System.out.println("Mappings of ht1 : " + ht1);
      
    }

}