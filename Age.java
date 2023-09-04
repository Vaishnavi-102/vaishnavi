class Age
{
public static void main(String args[])
{
	int DOY=2002, Current=2023,current_Age; 
	int months,weeks,days, hours,mins,sec;
	current_Age=(Current-DOY);
	System.out.println("current age in Years:" +current_Age);
	months=21*12;
        System.out.println("no.of months :" +months);    
	weeks=21*58;
        System.out.println("no.of weeks :" +weeks);    
	days=current_Age*365;
        System.out.println("no.of days :" +days);    
	hours=days*24;
        System.out.println("no.of hours :" +hours);    
	mins=hours*60;
        System.out.println("no.of mins :" +mins);    
	sec=mins*60;
        System.out.println("no.of secs :" +sec);    




}
}
