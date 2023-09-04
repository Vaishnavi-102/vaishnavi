class Pro
{
	public static void main(String args[])
	{
		String P1="67366";
		String  pname="MOBILE";
		String Pcode="M63E";
		int price=500;
		int quantity=2;
		int total=(price*quantity);
		double discount;
         	double amount;
			if(total>2000)
			{
			discount=((total*10)/100);
			amount=total-discount;
			System.out.println("total is greater than 2000 ,10% discount is applied  :" +amount);
			}
			else
			{
			discount=((total*5)/100);
			amount=total-discount;
			System.out.println("total is less than 2000 ,5% discount is applied  :"   +amount);
			}
	}
}
