package Accenture_jobs;

public class Reverse_on_place {

	public static void main(String[] args) 
	{
		String s1="xyz kumar yadav abc cdf";


		String[] s2 = s1.split(" ");


		for(int i=0;i<s2.length;i++)
		{
			if(i%2==0) {
				//System.out.println(s2[i]);
				String s3="";
				for(int j=s2[i].length()-1;j>=0;j--)
				{
					char ch = s2[i].charAt(j);

					s3=s3+ch;
				}

				System.out.println(s3);
			}else {
			System.out.println(s2[i]);
		}
		}
	}

}
