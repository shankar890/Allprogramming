package Accenture_jobs;

import java.util.HashSet;
import java.util.Set;

public class x {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,2,2};


		Set<Integer> maps=new HashSet();
		
		
		for(int sh:arr)
		{
			
			//System.out.println(maps.add(sh));
			
		boolean sh2 = maps.add(sh);
		System.out.println(sh2);
		if(sh2==false)
		{
			System.out.println(sh);
		}
			
			
			
			
		}



System.out.println(maps);


	}
}