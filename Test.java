package Accenture_jobs;

public class Test {

	public static void main(String[] args) 
	{
		String s1="hello i am shankar";
		String[] s2 = s1.split(" ");

		for(int i=0;i<s2.length;i+=2)
		{
			System.out.println(s2[i]); 
			if(i%2==0)
			{

			System.out.println("X"); 

		}}
	}
}
