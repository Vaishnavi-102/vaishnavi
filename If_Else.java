class If_Else
{
public static void main(String args[])
{
String name="Sam";
char section='A';
int s1=75, s2=65, s3=76, s4=44, s5=90, s6=37;
int total=s1+s2+s3+s4+s5+s6;
double per=(total*100)/600;
int fee=74000;
int scholarship=0,donation=0;
String grade;

if(per>80)
{
section='A';
scholarship=10000;
donation=0;
grade="PASS";
}
else
{
section='B';
scholarship=0;
donation=15000;
grade="FAIL";
}
fee=(fee+donation)-scholarship;
System.out.println("total amount to be paid:" +fee);
}
}