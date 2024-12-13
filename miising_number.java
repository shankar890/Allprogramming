package Accenture_jobs;

public class miising_number {
	

	public static void main(String[] args) 
	{



		int num =87;
		int sum=0;
		
		while(num>9) {
			sum=0;
		while (num > 0 )
		{
			
			int D=num%10;
			sum= sum+D;
			num=num/10;

		}
		num=sum;
		}
		
	
		System.out.println(sum);
		
	}


}
