class Prime
{
public static void main(String args[])
{
int start=1, num=10, count=0;
while(start<=num)
{
	 if(num%start==0)
	{
	count++;
	}
	start++;
}
System.out.println(count);
if(count==2)
{
System.out.println("prime");
}
else
{
System.out.println(" Not prime");
}
}
}