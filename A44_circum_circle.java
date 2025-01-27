package assignpackage;

import java.util.Scanner;

public class A44_circum_circle {
	static double pi_value=3.14;
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of radius");
		int r=s1.nextInt();
		double c=2*pi_value*r;
		
		System.out.println("the circumference of the circle is"+c);
	}

}
