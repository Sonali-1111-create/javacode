package assignpackage;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Viva2 {
	public static void main(String[] args) {
		try {
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		System.out.println(age);
		}
		catch(InputMismatchException e)
		{
		System.out.println("enter the age");
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		}
		
	}

}
