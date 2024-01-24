package practice;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Object, Object> m =new TreeMap<Object, Object>(new MyComparator3());
		m.put(100, "zzz");
		m.put(103, "yyy");
		m.put(101, "xxx");
		m.put(104, 106);
		System.out.println(m);

	}

}
 class MyComparator3 implements Comparator
 {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	 
 }