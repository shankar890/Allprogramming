package Accenture_jobs;

public class remove_Duplicate_char {

	public static void main(String[] args)
	{

		String s1="shankarkumar";
		StringBuilder str=new StringBuilder();

		char[] ch = s1.toCharArray();


		for(int i=0;i<ch.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{

				//System.out.println(ch[i]);

				if(ch[i]==ch[j])
				{
					flag=true;
					break;

				}
			}

			if(!flag) {
				str.append(ch[i]);
			}

		}
		System.out.println(str);

	}}
