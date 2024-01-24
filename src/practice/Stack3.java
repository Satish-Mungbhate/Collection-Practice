package practice;

import java.util.Iterator;
import java.util.Stack;

public class Stack3 {
	
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<>();
		
		boolean result=stk.empty();
		System.out.println("is stack empty?"+result);
		
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		
		System.out.println("Stack :"+stk);
		result=stk.empty();
		System.out.println("is Stack empty ?"+result);
		
		int fruits=stk.peek();
		System.out.println("element at top :"+fruits);
		
		int x=stk.size();
		System.out.println("size of stack is :"+x);
		
		Iterator<Integer> iterator=stk.iterator();
		while(iterator.hasNext())
		{
			Object valuse=iterator.next();
			System.out.println(valuse);
		}
	}

}
