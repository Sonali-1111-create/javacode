package assignpackage;

class Parent
{
	void subtract()
	{
		int a=50;
		int b=40;
		int c=a-b;
		System.out.println("the subtraction value is"+c);
	}
}

public class A49_SingleInherit_nonstatic extends Parent{
	public static void main(String[] args)
	{
		
		A49_SingleInherit_nonstatic s1=new A49_SingleInherit_nonstatic();
		s1.subtract();
		
	}

}
