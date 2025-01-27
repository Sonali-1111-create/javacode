package assignpackage;
import java.util.Scanner;

public class A40_area_circle {
	static double pi_value=3.14;
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of radius");
		int r=s1.nextInt();
		double area=pi_value*r*r;
		System.out.println("the  area of circle is "+area);
	}

}
