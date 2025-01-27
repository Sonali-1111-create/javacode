package assignpackage;

import java.util.Arrays;

public class A80_arrayprogram 

{
	static int count_alphabet=0;
	static int count_numeric=0;
	static int count_space=0;
	public static void main(String[] args)
	{
		String s1="kv no 2% $#";
		char c1[]=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<s1.length();i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			boolean b3=Character.isWhitespace(c1[i]);
			if(b1==true)
				{
					count_alphabet++;	
				}
			if(b2==true)
			{
				count_numeric++;
			}
			if(b3==true)
			{
				count_space++;
			}
			}
		System.out.println(count_alphabet);
		System.out.println(count_numeric);
		System.out.println(count_space++);
		int countof_specialchar=c1.length-(count_alphabet+count_numeric+count_space++);
		
	
	}
	}


	

