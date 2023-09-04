class Student
{
public static void main(String args[])
{
int std_id=38;
String std_name="VAISHNAVI";
int telugu=70, hindi=80, english=95, maths=99, science=88, social=91;
double total,percentage,average;
double sub=100;
double per_tel=(telugu/sub)*100;
System.out.println(per_tel);
double per_hin=(hindi/sub)*100;
System.out.println(per_hin);
double per_eng=(english/sub)*100;
System.out.println(per_eng);
double per_mat=(maths/sub)*100;
System.out.println(per_mat);
double per_sci=(science/sub)*100;
System.out.println(per_sci);
double per_soc=(social/sub)*100;
System.out.println(per_soc);
total=telugu+hindi+english+maths+science+social;
System.out.println(total);
percentage=(total/600)*100;
System.out.println(percentage);
average=total/6;
System.out.println(average);
}
}




