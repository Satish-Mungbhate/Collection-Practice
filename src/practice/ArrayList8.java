package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList8 {
	
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Audi");
		cars.add("Ford");
		Collections.sort(cars);
		for(String i:cars)
			System.out.println(i);
	}

}
