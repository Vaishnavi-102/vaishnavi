class NestedIf
{
	public static void main(String args[])
	{
	int n1=8, n2=474, n3=73;
	if(n1>n2)
	{
		System.out.println("n1 is greater than n2");
		if(n1>n3)
		{
		System.out.println("n1 is greater than n3");
		}
		else
		{
		System.out.println("n3 is greater than n1");
		}
	}
        else
	{
		if(n2>n3)
		{
		System.out.println("n2 is greater than n3");
		}
		else	
		{
		System.out.println("n3is greater than n2");
		}
	}
	}
}
