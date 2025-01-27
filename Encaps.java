package assignpackage;
class X
{
	private String un="kuanr.sonali@gmail.com";

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}
	 
}
public class Encaps {
	public static void main(String[] args) {
		X x1=new X();
		x1.setUn("lips.sonash@gmail.com");
		
		System.out.println(x1.getUn());
		
	}

}
