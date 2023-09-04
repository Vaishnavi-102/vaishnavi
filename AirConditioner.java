class AirConditioner
{

public static void main(String args[])
{
String name = "Voltas AC 2023 Model";
double actual_price = 75990;
double off = 48;
double discount = (48.0/100)*75990;
double total_price= (actual_price-discount);
int coupon=500;
double total_amount = (total_price-coupon);
double bank_off= (10.0/100)*total_amount;
double amount = total_amount - bank_off;

System.out.println("Name               :     "+name);
System.out.println("Actula Price       :    "+actual_price);
System.out.println("Discount (48%)      :    "+discount);
System.out.println("Total price        :    "+total_price);
System.out.println("Coupon            :    "+coupon);
System.out.println("Total Amount         :    "+total_amount);
System.out.println(" Bank offer (10%)        :   "+bank_off);
System.out.println("Final Amount           :    "+amount);
}
}
