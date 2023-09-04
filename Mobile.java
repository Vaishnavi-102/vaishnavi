class Mobile
{
public static void main(String args[])
{
	 String  ProductName="APPLE iphone14";
	 String Model="Blue 128GB";
 	 System.out.println(ProductName);
	 System.out.println(Model);

	int actualprice=79900;
	System.out.println("Actualprice:" +actualprice);

	int offer=(79900/100)*14;
	System.out.println(offer);

	int Afteroffer=actualprice-offer;
	System.out.println(Afteroffer);

        int charges=Afteroffer+99;
	System.out.println("After the charges: "+charges);

	System.out.println("5% OFFER ON AXIS BANK");
	int bankoffer=(charges/100)*5;
	 System.out.println("bank offer:" +bankoffer);

	int totalamount=charges-bankoffer;
	System.out.println("Total:" +totalamount);
	int exchange=7000;
	int AmounttoPaid=totalamount-exchange;
	System.out.println("FINAL AMOUNT TO BE PAID:" +AmounttoPaid);

	System.out.println("SUPER COINS");
	int supercoins=65373/50;
	System.out.println("No.of supercoins:" +supercoins);

}
}
