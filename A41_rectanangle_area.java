package assignpackage;

import java.util.Scanner;

public class A41_rectanangle_area {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of length and breadth");
		int l=s1.nextInt();
		int b=s1.nextInt();
		int area=l*b;
		System.out.println("the area of rectangle is "+area);
	}

}
