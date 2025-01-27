package assignpackage;

public class A23_Method_overload {
	static void add()
	{
	System.out.println("Method overload");
	}
	static void add(int a,int b)
	
	{
	int c=a+b;
	System.out.println("Addition value is "+c);
	}
	void add(double d)
	{
	System.out.println("non static method overloading");	
	}
	public static void main(String[] args)
	{
		add();
		add(11,11);
		A23_Method_overload m1=new A23_Method_overload();
		m1.add(10);
	}

}
