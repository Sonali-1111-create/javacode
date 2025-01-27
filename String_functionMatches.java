package assignpackage;

public class String_functionMatches {
	public static void main(String[] args)
	{
		String a="axe";
		boolean b=a.matches("...");//it return boolean value true or false
		System.out.println("the matches is:-"+b);
		System.out.println(a.matches("a(.*)"));//given string starts with a
		System.out.println(a.matches("(.*)e"));//given string starts with e
		String s ="Sonali kuanr";
		System.out.println(s.matches("(.*)u(.*)"));//given string has u in the middle

	}

}
