package assignpackage;

public class A19_nonstatic_para {
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		A19_nonstatic_para a=new A19_nonstatic_para();
				a.add(100,200);
	}

}
