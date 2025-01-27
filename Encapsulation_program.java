package assignpackage;
class A
{
	private int i=10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
public class Encapsulation_program {
	public static void main(String[] args) {
		
   A e1=new A();
    
     e1.setI(20);
     System.out.println(e1.getI());
	
	}

}