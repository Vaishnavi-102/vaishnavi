class University
{
public static void main(String args[])
{
int A=70;
int B=30;
double per_A=(A*100)/100;
double per_B=(B*100)/100;
if((per_A>=55.0)&&(per_B>=45.0))
{
System.out.println("CLEARED -1");
}
else if((per_A<=55.0)&&(per_B>=55.0))
{
System.out.println("FAILED IN B");
}
else if((per_A>=65.0)&&(per_B<=45.0))
{
System.out.println("ALLOWED TO REAPPEAR TO QUALIFY B");
} 
if((per_A>=45)&&(per_B>=45))
{
System.out.println("PASS");
}
else
{
System.out.println("FAIL");
}
}
}
