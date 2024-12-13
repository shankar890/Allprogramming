package Accenture_jobs;

import java.util.HashMap;
import java.util.Set;

public class Acuurence {

	public static void main(String[] args) 
	{

		String s1="shnakarkkaromar";
		
		char[] ch = s1.toCharArray();
		HashMap<Character,Integer> maps=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) 
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					
					count++;		
				}
				maps.put(ch[i], count);
			}		
		}
		
		Set<Character> sh = maps.keySet();
		for(Character key:sh)
		{
			System.out.println(key +" "+ maps.get(key));
		}
	}

}
