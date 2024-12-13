package Accenture_jobs;

import java.util.Arrays;

public class remove_duplicateu {

	public static void main(String[] args)
	{

		int arr[]= {2,3,5,1,2,5};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
			
		}
		
		//System.out.println(Arrays.toString(arr));
		
		
	}

}
