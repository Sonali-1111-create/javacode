package assignpackage;

public class String_function {
	public static void main(String[] args)
	
	{
		String a="automation";
		System.out.println(a.replace('a','m'));
		String a1="automation testing";
		System.out.println(a1.replace("automation","api"));
		String name="Sonali Kuanr";
		System.out.println(name.replaceAll("[A-Z]",""));
		String name1="Kv No 2";
		System.out.println(name1.replaceAll("[a-z]", ""));
		String number="Kv No 2";
		System.out.println(number.replaceAll("[0-9]",""));
	}
	

}
