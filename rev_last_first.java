package Accenture_jobs;

import java.util.Arrays;

public class rev_last_first {

	public static void main(String[] args) 
	{

		int[] arr= {45,54,32,34,55,65};

		for(int i=0;i<arr.length;i++)
		{

			//System.out.println(arr[arr.length-1]);
			
			int x=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=x;
			
			
		}
		System.out.println(Arrays.toString(arr));
		


	}

}
