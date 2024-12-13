package Accenture_jobs;

public class Digit_number {

	public static void main(String[] args)
	{
		String s1="String123";
		String str="";		
		for(int i=0;i<s1.length();i++)
		{

			char ch = s1.charAt(i);

			if(Character.isDigit(ch))
			{

				str=str+ch;

			}

		}
		System.out.println(str);
		int st = Integer.parseInt(str);
		int sum=0;
		while(st!=0)
		{
			
			int D=st%10;
			sum= sum+D;
			st=st/10;
			
			
		}
System.out.println(sum);

	}

}
