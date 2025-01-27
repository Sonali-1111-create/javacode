package assignpackage;
class Google_auth2
{
	void login()
	{
		System.out.println("Login with emailId");
	}
}

public class A58_methodoverriding extends Google_auth2
	{
		void login()
		{
			super.login();
			System.out.println("Login with phone no.");
		}
	
	public static void main(String[] args)
	{
		A58_methodoverriding m1=new A58_methodoverriding();
		m1.login();
	}

}
