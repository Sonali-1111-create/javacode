package assignpackage;
import java.util.Scanner;

public class A43_circum_triangle {
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the base value of triangle");
		int b=s1.nextInt();
		System.out.println("enter the height value of triangle");
		int h=s1.nextInt();
		System.out.println("enter the side of the triangle");
		int d=s1.nextInt();
		int circum=b+h+d;
		System.out.println("the circumference of triangle is"+circum);
		
	}

}
