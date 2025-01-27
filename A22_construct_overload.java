package assignpackage;

public class A22_construct_overload {
	
	A22_construct_overload(int a)
	{
		System.out.println("this is my first constructor");
	}
	A22_construct_overload(double b,int c)
	{
		double d=b+c;
		System.out.println(d);
	}
	A22_construct_overload(int a,double b,String c)
	{
		System.out.println("my third constructor");
	}
	
	public static void main(String[] args)
	{
		new A22_construct_overload(10);
		new A22_construct_overload(20,30);
		new A22_construct_overload(1,2,"sonali");
	}
		
	

}
