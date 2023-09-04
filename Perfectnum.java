class Perfectnum
{
public static void main(String args[])
{
int start=1, num=6, sum=0;
while(start<num)                        //1<6 -------------
{
	 if(num%start==0)		//6%1==0------------------
	{
	sum=sum+start;			//sum=1  	sum=3 		sum=6
	}
	start++;        			//2  		3 		4		5
}
if(sum==num)
{
System.out.println("perfect number");
}
else
{
System.out.println(" Not perfect number");
}
}
}