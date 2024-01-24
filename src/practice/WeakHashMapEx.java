package practice;

import java.util.HashMap;

public class WeakHashMapEx {

	public static void main(String[] args) throws Exception {
       
		//WeakHashMap<Object, Object> m=new WeakHashMap<Object, Object>();
		 HashMap<Object, Object> m=new HashMap<Object, Object>();
		 Temp t =new Temp();
		 System.out.println(m);
		 t=null;
		 System.gc();
		 Thread.sleep(5000);
		 System.out.println(m);
   }
}

class Temp{
	public String toString()
	{
		return "Temp";
	}
	
	public void finalize()
	{
		System.out.println("Finalized method called");
	}

}