package test_miscellaneous.others;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic_int {
	public static void main(String args[])
	{
		AtomicInteger q = new AtomicInteger(0);
	    q.set(5);
	    System.out.println(q);
	    int n=q.get();
	    System.out.println(n);
	    Map<Integer,String> map=new HashMap<Integer,String>();  
	   // map=
	    
	}

}
