package practice;

import java.util.Stack;

public class Stack2 {
	
	public static void main(String[] args) {
		Stack<String> animals=new Stack<String>();
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Stack :"+animals);
		
		int position=animals.search("Horse");
		System.out.println("Position of Horse :"+position);
		
		boolean result=animals.empty();
		System.out.println("Is Stack empty ? :"+result);
	
		String element=animals.peek();
		System.out.println("element at the top :"+element);
		
		String element1=animals.pop();
		System.out.println("removed element is :"+element1);
	}

}
