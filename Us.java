class Us
{
public static void main(String args[])
{
int tot_classes=300;
int attended_classes=300;
int attendence=tot_classes-attended_classes;
double max=100;
double per =(attendence*max)/300;
System.out.println("Percentage:" +per);
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

