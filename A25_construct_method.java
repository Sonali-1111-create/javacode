package assignpackage;

public class A25_construct_method {
	A25_construct_method(double a,int b)//constructor overloading
	
	{
		double c=a+b;
		System.out.println("the addition value is "+c);
		
	}
	A25_construct_method(int d,int e)
	{
		int f=d-e;
		System.out.println("the substraction value is "+f);
	}
	
	static void add(int a,int b,int d)//method overloading
	{
	int c=a+b+d;
	System.out.println("the add value is "+c);
	}
	static void add(String s)
	{
		System.out.println("a long string "+s);
	}
	
	public static void main(String[] args)
	{
		new A25_construct_method(20.0,50);
		new A25_construct_method(100,200);
		
		add(50,50,50);
		add("abcdefghij");
		
	}
	
	
	
	

}
