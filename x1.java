package Accenture_jobs;

import java.util.Arrays;

public class x1 {

	public static void main(String[] args) 
	{
		String s1="shankkkartat";
		String s2="shaankktkart1";
		
		if(s1.length()==s2.length())
		{
			String a1 = s1.toLowerCase();
			String a2 = s2.toLowerCase();
			char[] b1 = a1.toCharArray();
			char[] b2 = a2.toCharArray();
			Arrays.sort(b1);
			Arrays.sort(b2);
			
			
			if(Arrays.equals(b1, b2))
			{
				System.out.println("it is anchrome");
			}
			else {
				System.out.println("it is not");
			}
	
			
		}
		else {
			
			System.out.println("it is not angram");
			
		}
		

	}

}
