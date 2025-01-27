package assignpackage;

interface One
{
void add();
void sub();
}
interface Two
{
	void mul();
	void div();
}
public class A67_multiple_interface implements One,Two {
	public static void main(String[] args)
	{
		A67_multiple_interface a1=new A67_multiple_interface();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("multiplication");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Division");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("addition");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("subtraction");
	}


}
