package Accenture_jobs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Accurece {

	public static void main(String[] args) 
	{

		String s1="shankarKumar";
		char[] ch = s1.toCharArray();
		Map<Character,Integer> maps=new HashMap<Character, Integer>();

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
		System.out.println(maps);
		
		Set<Character> sh = maps.keySet();
		for(Character key:sh)
		{
			Integer sh1 = maps.get(key);
			
			String sh2 = sh1.toString(sh1);
			System.out.println(sh2);
			
			
			
		}
		
		
		
	}

}
