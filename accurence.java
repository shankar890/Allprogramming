package Accenture_jobs;

import java.util.HashMap;

public class accurence {

	public static void main(String[] args)
	{

		String s1="shabkaravs";

		char[] ch = s1.toCharArray();

		HashMap<Character,Integer>maps=new HashMap<>();


		for(int i=0;i<ch.length;i++)
		{

			int count=0;
			for(int j=0;j<ch.length;j++)
			{

				if(ch[i]==ch[j])
				{
					count++;

				}


			}
			maps.put(ch[i], count);


		}
		//System.out.println(maps);
		for(Character key1:maps.keySet())
		{
			System.out.print(key1+""+maps.get(key1));
		}

		








	}

}
