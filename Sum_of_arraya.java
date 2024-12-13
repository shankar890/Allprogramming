package Accenture_jobs;

public class Sum_of_arraya {

	public static void main(String[] args) 
	{

		int arr[]= {1,2,4,5,7,8};
		int sum=0;

		int product=0;

		for(int i=0; i<arr.length;i++) {	
			if(arr.length%2==0)
			{

				sum+=arr[i];

			}else 
			{

				product=product*arr[i];
			}

			
		}

		System.out.println(sum);
		System.out.println(product);


	}

}
