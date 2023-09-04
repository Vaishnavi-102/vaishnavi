class If_Else1
{
public static void main(String args[])
{   
String name="Sam";
String departmenyt=" developer";
int basic=25000;
int ta=(basic*15)/100;
int da=(basic*12)/100;
int hra=(basic*19)/100;
int total=basic+ta+da+hra;
double pf=0,tax=0,gross;
if(total>40000)
{
pf=(basic*11)/100;
tax=(basic*5)/100;
}
else
{
pf=(basic*7)/100;
tax=(basic*2.5)/100;
}
gross=total-pf-tax;
System.out.println("Gross salary:" +gross);
System.out.println("Annual Income");
System.out.println("Annual Income");
System.out.println(gross*12);
}
}