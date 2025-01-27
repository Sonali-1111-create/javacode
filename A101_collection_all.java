package assignpackage;
import java.util.Collection;
import java.util.ArrayList;
public class A101_collection_all {
	public static void main(String[] args)                                                                                                                    
	{
		Collection c1=new ArrayList();
		c1.add("lion");
		c1.add("tiger");
		c1.add("horse");
		c1.add("cow");
		c1.add("horse");
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("elephant");
		c2.add("cat");
		System.out.println(c2);
		
		
	}

}
