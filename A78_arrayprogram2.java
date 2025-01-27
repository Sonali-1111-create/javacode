package assignpackage;

public class A78_arrayprogram2 {
	public static void main(String[] args)
	{
		int[] rollno=new int[4];
		rollno[0]=21;
		rollno[1]=23;
		rollno[2]=25;
		rollno[3]=34;
		int givenno=34;
		for(int i=0;i<=3;i++)
		{
			if(givenno==rollno[i])
			{
				System.out.println("the no is present");
				System.out.println( "index of the no is"+i);
			}
		}
		
	}
	

}
