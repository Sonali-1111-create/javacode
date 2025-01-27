package assignpackage;
import java.util.Arrays;
import java.util.Scanner;

public class A76_arrayvalue_runtime {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int age[]=new int[4];
		/*age[0]=s1.nextInt();
		age[1]=s1.nextInt();
		age[2]=s1.nextInt();
		age[3]=s1.nextInt();*/
		for(int i=0;i<=3;i++)
		{
			age[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(age));
	}
	}


