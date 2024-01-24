package practice;

import java.util.TreeSet;

public class TreeSet6 {

	public static void main(String[] args) {
		 
		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("J"));
		t.add(new StringBuffer("K"));
		System.out.println(t);

	}

}