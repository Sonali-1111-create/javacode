package assignpackage;

import java.util.Scanner;

public class A45_circum_rectangle {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of length and breadth");
		int l=s1.nextInt();
		int b=s1.nextInt();
		int c=2*(l+b);
		System.out.println("the circumference of rectangle is "+c);
	}
		

}
