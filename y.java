package Accenture_jobs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class y {

	public static void main(String[] args)
	{
		
	int arr[]= {11,43,67,11,54,43,76,76,12,13,12};	
	
	
	Map<Integer, Integer> maps=new HashMap<>();
	
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				
			}
			
			maps.put(arr[i], count);
		}
		
		
		
	}
		
		//System.out.println(maps);
		Set<Integer> sh = maps.keySet();
		for(Integer keys:sh)
		{
			System.out.println(keys);
		}
		
		

	
	}
}
