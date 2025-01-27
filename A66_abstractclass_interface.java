package assignpackage;

interface Grandparent
{
	void mul();
	void div();
}
abstract class parent1 implements Grandparent
{
	abstract void mul1();
	abstract void div1();
	void looptoprintname()
	{
		System.out.println("logic to expose");
	}
}
public class A66_abstractclass_interface extends parent1 
{
	public static void main(String[] args)
	{
		A66_abstractclass_interface a1=new A66_abstractclass_interface();
		a1.mul();
		a1.div();
		a1.mul1();
		a1.div1();
		a1.looptoprintname();
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
	System.out.println("multiplication process");	
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("division process");
	}

	@Override
	void mul1() {
		// TODO Auto-generated method stub
		System.out.println("multiplication process1");
	}

	@Override
	void div1() {
		// TODO Auto-generated method stub
		System.out.println("division process1");
	}
}

