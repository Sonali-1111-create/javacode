package assignpackage;

public class Assignment_24 {
	static void test(int a)
	{
		System.out.println(a);
	}
	static void test(float b)
	{
		System.out.println(b);
	}
	static void test(double d)
	{
		System.out.println(d);
		
	}
	static void test()
	{
		System.out.println("test program");
		
	}
	static void test(char a1)
	{
		System.out.println(a1);
	}
	void test(int b,int c)
	{
		System.out.println("Non static method 1");
	}
	void test(double b,String s)
	{
		System.out.println("Non static method 2");
	}
	void test(boolean b)
	{
		System.out.println("Non static method 3");
	}
	void test(char c1,String s1)
	{
		System.out.println("Non static method 4");
	}
	void test(int i, double d)
	{
		double g=i+d;
		System.out.println("non static method 5 with the test value "+g);
	}
	public static void main(String[] args)
	{
		test(500);
		test(20.0f);
		test(50);
		test();
		test(5);
		Assignment_24 a1=new Assignment_24();
		a1.test(2,3);
		a1.test(5,"ansh");
		a1.test(true);
		a1.test('a',"papa");
		a1.test(21,32.0);
		
	}
	

}
