class Us
{
public static void main(String args[])
{
int tot_classes=300;
int attended_classes=200;
int attendence=tot_classes-attended_classes;
double per =(attendence*100)/300;
if(per>75)
{
System.out.println("Allowed to write exams");
}
else
{
System.out.println("Not Allowed to write exams");
}
}
}

