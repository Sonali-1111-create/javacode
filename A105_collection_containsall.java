package assignpackage;

import java.util.Collection;
import java.util.ArrayList;

public class A105_collection_containsall {
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
	System.out.println(c2.containsAll(c1));
	}

}
