package Accenture_jobs;

public class prime {

	public static void main(String[] args) 
	{
		int n=10;
		for(int j=2;j<n;j++)
		{


			int count=0;

			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(j+"prime");
			}
			else {
				System.out.println(j+"not prime");
			}

		}

	}
}