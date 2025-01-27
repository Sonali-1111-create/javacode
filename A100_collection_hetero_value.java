package assignpackage;

import java.util.ArrayList;
import java.util.Collection;

public class A100_collection_hetero_value {
	public static void main(String[] args)
	{
	Collection c1	=new ArrayList();
	c1.add('x');
	c1.add(9.87);
	c1.add(true);
	c1.add(11);
	System.out.println(c1);
	}

}
