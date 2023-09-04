class Oddeven
{
public static void main(String args[])
{
	int n=6;
	if(n%2==0)
	{
		n=n/2;
		System.out.println(" EVEN NUMBER");
	}
	else
	{
		n=(3*n+1)/2;
		System.out.println(" ODD NUMBER");
	}
System.out.println(n);

}
}	