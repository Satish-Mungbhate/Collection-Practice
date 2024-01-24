package practice;

import java.util.*; 

public class HashMapExample1{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Vaishnavi");  //Put elements in Map  
   map.put(2,"Shivani");    
   map.put(3,"Shradha");   
   map.put(4,"Rushi");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}