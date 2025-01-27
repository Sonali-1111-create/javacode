package assignpackage;

public class A30_Thread_class {

	public static void main(String[] args) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
}
