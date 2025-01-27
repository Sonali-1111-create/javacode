package assignpackage;

public class A97_stringbufferappend {
	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("automation");
		s1.append(" testing");
		System.out.println(s1);
		
		s1.insert(10," api");
		System.out.println(s1);

		System.out.println(s1.substring(11));
		System.out.println(s1.substring(11,22));
		s1.replace(11, 14, "web");
		System.out.println(s1);
		
		s1.delete(0,7);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
	}

}
