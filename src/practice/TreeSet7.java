package practice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet7 {

	public static void main(String[] args) {
		  TreeSet<String> t =new TreeSet<String>(new MyComparator());
		  t.add("vaishnavi");
		  t.add("shivani");
		  t.add("shubham");
		  t.add("aniket");
		  t.add("anurag");
		  System.out.println(t);

	}

}
 class MyComparator implements Comparator<Object>
 {

	@Override
	public int compare(Object o1, Object o2) {
		String S1=o1.toString();
		String S2=(String)o2;
		return S2.compareTo(S1);
	}
	 
 }