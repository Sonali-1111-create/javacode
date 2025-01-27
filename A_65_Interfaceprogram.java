package assignpackage;

interface Addition
{
	void add();
	void sub();
}

public class A_65_Interfaceprogram implements Addition {
	
		public void add()
		{
			System.out.println("real logic develop by developer");
		}
		
		public void sub()
		{
			System.out.println("real logic develop by developer1");
			
		}
		public static void main(String[] args)
		{
			
			A_65_Interfaceprogram a1=new A_65_Interfaceprogram();
			a1.add();
			a1.sub();
		
	}
	
	

}