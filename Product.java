class Product
{
public static void main(String args[])
{
int p_id=7893;
System.out.println(p_id);

String p_name="LAPTOP";
System.out.println(p_name);

String barcode="W20H458J32S";
System.out.println(barcode);

int actualprice=89000;
System.out.println(actualprice);

double offerprice=1999;
System.out.println(offerprice);

double total=(actualprice-offerprice);
System.out.println(total);

double discount=(total/100)*10;
System.out.println(discount);

double finaltot=(total-discount);
System.out.println(finaltot);

double gst=(finaltot/100)*18;
System.out.println(gst);

double finalamount=(finaltot+gst);
System.out.println(finalamount);

}
}









 
