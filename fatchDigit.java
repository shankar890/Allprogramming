package Accenture_jobs;

public class fatchDigit {

	public static void main(String[] args) 
	{

		String s1="xyz1234";

		String s2="";
		for(int i=0;i<s1.length();i++)
		{

			if(Character.isDigit(s1.charAt(i)))
			{

				s2=s2+s1.charAt(i);


			}

		}

	//	System.out.println(s2);
		int number = Integer.parseInt(s2);
		
System.out.println(number);
	}

}
