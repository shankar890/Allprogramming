package Accenture_jobs;

public class Upper_lower {

	public static void main(String[] args) 
	{


		String s1="StRtsing@@@34";
		int Uppercount=0;
		int lowercount=0;
		int digitcount=0;

		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{

			if(Character.isLowerCase(ch[i]))
			{

				Uppercount++;

			} else if (Character.isUpperCase(ch[i]))
			{
				lowercount++;
			}else {

				digitcount++;
			}


		}

		System.out.println(lowercount);
		System.out.println(Uppercount);
		System.out.println(digitcount);




	}

}
