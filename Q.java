class Q
{
	public static void main(String args[])
	{
		int  a=40, b=20;
		System.out.println("BEFORE SWAPPING");
		System.out.println("a :" +a);
		System.out.println("b :"  +b);
		if(a%b==0)
		{
		System.out.println("a is divisible by b");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER SWAPPING");
		System.out.println("a :" +a);
		System.out.println("b :"  +b);
		}
	}
}
