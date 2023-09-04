class FineLi
{
public static void main(String args[])
{
int days=6;
double fine;
if(days<=5)
{
fine=0.50;
System.out.println("Fine for first five days :" +fine);
}
else if((days>5)&&(days<=10))
{
fine=1.0;
System.out.println("Fine for ten days :" +fine);
}
else if(days>10)
{
fine=5.0;
System.out.println("Fine for above 10  days :" +fine);
}
if(days<=10)
{
System.out.println("PAY  THE FINE TO GET ACCESS");
}
else
{
System.out.println("LIBRARY MEMBERSHIP IS CANCELLED");
}
}
}
