class Emp
{
public static void main(String args[])
{
int eid=6298;
String ename="VAISHNAVI";
String dept="Development";
String Designation="Senior Developer";
double basic=15000,tax=200,pf=1800,bonus=917;
double TA,DA,HRA,Spl_a,gross,gst;
System.out.println(eid);
System.out.println(ename);
System.out.println(dept);
System.out.println(Designation);
System.out.println(basic);
TA=(basic/100)*10;
System.out.println(TA);
DA=(basic/100)*15;
System.out.println(DA);
HRA=(basic/100)*20;
System.out.println(HRA);
Spl_a=TA+DA+HRA;
System.out.println(Spl_a);
gross=basic + Spl_a;
System.out.println(gross);
double monthly_sal=gross-pf-tax+bonus;
System.out.println(monthly_sal);
gst=(monthly_sal*18)/100;
System.out.println(gst);
}
}