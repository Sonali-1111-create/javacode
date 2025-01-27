package assignpackage;
import java.util.Date;

public class Viva {
	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date (d1.getTime()+(1000*60*60*24*2));
		System.out.println(d2);
		String humantime=d2.toString();
		String time=humantime.substring(11,19);
		System.out.println(time);
		String year=humantime.substring(humantime.length()-4);
		System.out.println(year);
		
	

}
}
