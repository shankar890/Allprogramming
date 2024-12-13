package Accenture_jobs;

public class findupper {
	
	public static void main(String[] args) 
	{
		
		String s1="shankar@rtteSSSHHA";
		String capital="";
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		
		if(Character.isUpperCase(ch[i]))
				{
			
			
			capital=capital+ch[i];
			
			
				}
		
		
	}
		System.out.println(capital);

}
}