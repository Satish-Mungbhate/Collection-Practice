package practice;

import java.util.Stack;

public class Stack1 {
	
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println("Stack elements :");
		for(var v1:st)
			System.out.println(v1);
		
		System.out.println("Last element is :"+st.pop());
		
		System.out.println("Last element is :"+st.peek());
		
		System.out.println("New elements :");
		for(var v2:st)
			System.out.println(v2);
		
		System.out.println("Stack contains 5 elements :"+st.contains(5));
		
		System.out.println("Stack is empty :"+st.empty());
		
	}

}
