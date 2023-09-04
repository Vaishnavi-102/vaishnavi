class Year
{
public static void main(String args[])
{
int month=11;
int day1=31,day2=30,day3=28;
if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
{
System.out.println("No.of days in the month :" +day1);
}
else if((month==4)||(month==6)||(month==9)||(month==7)||(month==11))
{
System.out.println("No.of days in the month :" +day2);
}
else if(month==2)
{
System.out.println("No.of days in the month :" +day3);
}
else 
{
System.out.println("enter a valid number ");
}
}
}

