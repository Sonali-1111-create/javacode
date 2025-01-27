package assignpackage;

public class Nonpara_supercalling extends Google_auth1
	{
	Nonpara_supercalling()
	{
		super();
		System.out.println("Constructor2");
	}
	public static void main(String[] args)
	{
		
	new Nonpara_supercalling();	
	}
	}
	
	class Google_auth1
	{
		Google_auth1()
		{
			System.out.println("Constructor1");
		}
	}
	
	




