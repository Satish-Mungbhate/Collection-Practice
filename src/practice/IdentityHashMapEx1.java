package practice;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapEx1 {

	public static void main(String[] args) {
		IdentityHashMap m=new IdentityHashMap();
		Integer i1= new Integer(10);
		Integer i2= new Integer(10); // 20 then o/p 10 pawan 20 kalyan
		m.put(i1, "pawan");
		m.put(i2, "kalyan");
		System.out.println(m);
	   boolean m1 = i1.equals(i2);
	   System.out.println(m1);
	   boolean m3 = i1==i2;
	   System.out.println(m3);
		

	}

}