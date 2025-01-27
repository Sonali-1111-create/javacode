package assignpackage;
class Amazon_properties
{
	private String un="contact@grotechmind.com";
	
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
}


public class Encapsulation_program1 {
	public static void main(String[] args) {
		Amazon_properties a1=new Amazon_properties();
		a1.setUn("lips.sonash@gmail.com");
		System.out.println(a1.getUn());
		
	}

}
