package assignpackage;

import java.util.Scanner;

public class A42_area_square {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the side of square ");
		int a=s1.nextInt();
		int area=a*a;
		System.out.println("the area of square is "+area);
	}
}
