class Factors    
{
	public static void main(String args[])
	{
	int n=2;
	if(n%3==0)
	{
		if(n%5==0)
		{
		System.out.println("FIZZBUZZ");
		}
		else
	        {
		System.out.println("FIZZ");
		}
	}
	else
	{
		if(n%5==0)
		{
		System.out.println("BUZZ");
		}
		else	
		{
		System.out.println(n);
		}
	}
}
}

		
