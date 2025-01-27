package assignpackage;

public class A57_thiscalling {
	A57_thiscalling()
	{
		this(10);
		System.out.println("Non parametertised constructor");
	}
	A57_thiscalling(int a)
	{
		this("sk");
		System.out.println(a);
	}
	A57_thiscalling(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		new A57_thiscalling();
	}
}
