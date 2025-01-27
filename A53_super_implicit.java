package assignpackage;

class Google

{
	Google()
	{
		System.out.println("Google Constructor");
	}
	
}

public class A53_super_implicit extends Google{
	A53_super_implicit()
	{
	
		System.out.println("Constructor 2 is executed");
	}
	public static void main(String[] args)
	{
		
		new A53_super_implicit();
	}
	
	
	

}

