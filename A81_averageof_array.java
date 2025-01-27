package assignpackage;

public class A81_averageof_array {
	public static void main(String[] s)
	{
		double a[]=new double[5];
		double sum=0;
		
		a[0]=20;
		a[1]=21;
		a[2]=22;
		a[3]=23;
		a[4]=24;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		double average = sum/a.length;
		System.out.println(average);
	}
		
		

}

