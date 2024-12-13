package Accenture_jobs;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) 
	{
		int[] arr= {54,76,89,45,66,78,90,21};



		for(int i=0;i<arr.length;i++)
		{


			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
			}

  
			
			
			
		}


		System.out.println(Arrays.toString(arr));

	}

}
