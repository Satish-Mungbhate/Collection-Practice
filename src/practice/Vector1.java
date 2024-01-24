package practice;

import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		Vector<String> languages=new Vector<>();
		languages.add("C");
		languages.add("CPP");
		languages.add("java");
		languages.add("advance java");
		languages.add("Python");
		
		languages.add(2, "Cat");
		System.out.println("Vector elements is :"+languages);
		
		Vector<String> coding=new Vector<>();
		coding.add("Ruby");
		
		coding.addAll(languages);
		System.out.println("Vector :"+coding);
	}

}
