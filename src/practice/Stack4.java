package practice;

import java.util.Stack;

public class Stack4 {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		stk.push("Mac Book");
		stk.push("Dell");
		stk.push("HP");
		stk.push("asus");
		System.out.println("Stack :"+stk);
		
		int location=stk.search("HP");
		System.out.println("Location of HP :"+location);
	}
}
