package Accenture_jobs;

import java.util.HashMap;

public class a2b3c2 {

	public static void main(String[] args)
	{
		String str="aabbbcc";
		HashMap<Character,Integer> map=new HashMap<>();

		for(int i=0;i<str.length();i++)
		{

			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else
			{
				map.put(ch, 1);
			}

		}
		System.out.println(map.get(map));



	}

}
