package Accenture_jobs;

public class remove_duplicate {

	public static void main(String[] args)
	{

		String s1="Ssshankarkkumar";
		String s2="";


		for(int i=0;i<s1.length();i++)
		{
			char ch2 = s1.charAt(i);
			if(s2.indexOf(ch2)==-1)
			{
				s2+=ch2;
			}
		}
		System.out.println(s2);


	}

}
