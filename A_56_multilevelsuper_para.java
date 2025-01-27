package assignpackage;
class Abc
{
	Abc(String name)
	{
		System.out.println("constructor1");
	}
	
}
class Xyz extends Abc
{
	Xyz(int a)
	{
	super("Sonali");	
	System.out.println("constructor 2");

}
}

public class A_56_multilevelsuper_para extends Xyz
{
	A_56_multilevelsuper_para()
	{
	super(100);
	System.out.println("constructor 3");
	}

	public static void main(String[] args)
{
	new A_56_multilevelsuper_para();
}
}
