package assignpackage;

import java.util.ArrayList;
import java.util.Collection;

public class A104_collection_contains {
	public static void main(String[] args)
	{
	
	Collection c1=new ArrayList();
	c1.add("x");
	c1.add("2.12");
	c1.add("true");
	c1.add("peacock");
	c1.add("cow");
	System.out.println(c1);
	Collection c2=new ArrayList();
	c2.add("c++");
	c2.add("java");
	c2.add("python");
	System.out.println(c2);
	c2.addAll(c1);
	System.out.println(c2);
	System.out.println(c1.contains("peacock"));
	System.out.println(c2.contains("c++"));
	System.out.println(c2.contains("cow"));
	System.out.println(c2.contains("x"));
	

	}
}
