package assignpackage;
import java.util.Arrays;
import java.util.Scanner;

public class A77_Arrayequals {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int age[]=new int[4];
		int age1[]=new int[4];
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the age for the index->"+i);
			age[i]=s1.nextInt();
			age1[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(age1));
			
		boolean b1=Arrays.equals(age, age1);
		System.out.println(b1);
		
		
	}
	
	

}
