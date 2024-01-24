package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList6 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("EAST");
		al.add("WEST");
		al.add("NORTH");
		al.add("SOUTH");
		
		System.out.println("The arraylist is :"+al);
		System.out.println("size of arraylist :"+al.size());
		Collections.reverse(al);
		System.out.println("arraylist after reverse :"+al);
		al.clear();
		System.out.println("arraylist size after clear :"+al);
	}

}
