package assignpackage;

abstract class Google1
{
	abstract void login();
	abstract void registration();
	static void addition()
	{
		System.out.println("Concrete class1");
	}
	void subtraction()
	{
		System.out.println("Concrete class2");
	}
	
}


public class A64_abstractclass extends Google1 {
	void login()
	{
		System.out.println("API 1");
	}
	void registration()
	{
		System.out.println("API 2");
	}
	
	public static void main(String[] args)
	{
		A64_abstractclass a1=new A64_abstractclass();
		a1.login();
		a1.registration();
		a1.subtraction();
		addition();
		
	}
	
}
