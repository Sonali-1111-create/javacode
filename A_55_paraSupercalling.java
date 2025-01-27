package assignpackage;

class Amazon
{
	Amazon(int a)
	{
	System.out.println("Constructor1 is executed");
	}
}

public class A_55_paraSupercalling  extends Amazon{
	A_55_paraSupercalling()
	{
		super(100);
		System.out.println("Constructor 2 is executing now");
		
	}
	public static void main(String[] args)
	{
		new A_55_paraSupercalling();
	}
	}


