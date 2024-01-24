package practice;

import java.util.ArrayList;

public class ArrayList7 {
	
	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("audi");
		cars.add("Ford");
		System.out.println(cars);
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		
		for(String i:cars)
			System.out.println(i);
		
		System.out.println(cars.get(0));
		cars.set(0, "Opel");
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);
		cars.clear();
		System.out.println(cars);
		System.out.println(cars.size());
	}

}
