package practice;

import java.util.LinkedList;

public class LinkedList2 {
	
	public static void main(String[] args) {
		LinkedList<String> language=new LinkedList<String>();
		language.add("c");
		language.add("C++");
		language.add("Core Java");
		language.add("Advance java");
		System.out.println("LinkedList :"+language);
		
		language.add(0, "Swift");
		System.out.println("updated LinkedList :"+language);
		
		String str=language.get(1);
		System.out.println("element at index 1 :"+str);
		
		language.set(3, "R");
		System.out.println("updated LinkedList :"+language);
		
		String str1=language.remove(1);
		System.out.println("removed element is :"+str1);
		
		System.out.println("updated LinkedList :"+language);
		
		language.add("python");
		System.out.println("updated LinkedList :"+language);
		
		language.addFirst("Machine Learning");
		System.out.println("LinkedList after addFirst() :"+language);
		
		language.addLast("Artifial Intelligence");
		System.out.println("LinkedList After addLast() :"+language);
		
		language.removeFirst();
		System.out.println("LinkedList After Remove Elements :"+language);
		
		language.removeLast();
		for(String languages:language)
		{
			System.out.print(languages);
		    System.out.print(",");
		}
		
	}

}








