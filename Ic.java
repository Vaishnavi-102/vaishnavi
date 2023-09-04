class Ic
{
public static void main(String bargs[])
{
int a=6753,b=399309,c=3750, d;
System.out.println("BEFORE SWAPPING:");
System.out.println("A  :" +a);
System.out.println("B  :" +b);
System.out.println("C  :" +c);
if(a<b)
{
d=a;
a=b;
b=d;
}
if(a<c)
{
d=a;
a=c;
c=d;
}
if(b<c)
{
d=c;
c=b;
b=d;
}
else
{
System.out.println("False order");
}
System.out.println("AFTER SWAPPING");
System.out.println("A  :" +a);
System.out.println("B  :" +b);
System.out.println("C  :" +c);
}
}
