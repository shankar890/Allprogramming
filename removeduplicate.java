package Accenture_jobs;

public class removeduplicate {

	public static void main(String[] args) 
	{

		String s1="shankarkumar";
		String s2="";
		
		
		//char[] ch = s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			//char ch = s1.charAt(i);
			if(s2.indexOf(s1.charAt(i))==-1)
					{
				s2=s2+s1.charAt(i);
				
				
					}
			
			
		}
		
		
		
		System.out.println(s2);
		
		
		
	}

}
