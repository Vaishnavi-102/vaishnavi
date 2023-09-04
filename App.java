class App
{
public static void main(String args[])
{
	String application="LINKEDIN";
	System.out.println("Name of the Application :  " +application);
	System.out.println("A bussiness and employment-focused social media platform");


	String user="Vaishnavi";
	System.out.println("Username :  " +user);

	String pwd="wzdy_10702";
	System.out.println("Password : " +pwd);

	String Frames="OpenToWork";
	System.out.println("Status:" +Frames);
 
	int followers=250;
	System.out.println("No.of Followers:" +followers);

	int following=200;
	System.out.println("No.of Following:" +following);

	int total_connection = (followers+following);
	System.out.println("Total connections:" +total_connection);

	double active=(total_connection*10)/100;
	System.out.println("Active users :" +active);

	double focused=(total_connection*15)/100;
	System.out.println("Focused:" +focused);
	
	int premium=999;
	System.out.println("Amount to be to get golden membership :" +premium);

	String couponcode="WF693744GUO";
	System.out.println("Coupon code is:" +couponcode);

	int couponoffer=299;
	System.out.println(" Coupon offerprice :" +couponoffer);

	int totalamount=premium-couponoffer;
	System.out.println("Total amount : " +totalamount);
	System.out.println("WELCOME TO GOLDEN MEMBERSHIP-LinkedIn");
}
}





