package assignpackage;

public class A94_stringproblemcase1 {
	public static void main(String[] args) {
		String s1="Manish Kumar Tiwari";
		String s2=s1.replaceAll("[a-z]", "");
		System.out.println(s2);
		for(int i=0;i<s2.length();i++)
		{
			System.out.println("\t"+s2.charAt(i));
		}
		
	}

}
