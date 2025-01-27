package assignpackage;

public class StringFunction3 {
	public static void main(String[] args)
	{
		String c1="Automation Testing";
		String c2="automation testing";
		String c3="manual testing";
		System.out.println(c1.equals("Sonal"));
		System.out.println(c1.equals("Automation Testing"));
		System.out.println(c1.equals("Testing"));
		System.out.println(c1.contains("Automation"));
		System.out.println(c1.equalsIgnoreCase(c2));
		System.out.println(c1.equalsIgnoreCase(c3));
	}

}
