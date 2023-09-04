class Insurance
{
    public static void main(String args[]) 
	{
        int age = 27;
        String health = "excellent";
        String locality = "city";
        String gender = "male";
        double premium = 0;
        double policyamount = 170000;
	double max_amount=0;
	double loss=0;

        if ((age > 25 && age < 35) && (health==("excellent")) && (locality==("city")) && (gender==("male")) && (policyamount <= 200000)) 
	{
            premium = (policyamount * 4) / 1000;
	    max_amount=(200000*4)/1000;
        } 
	else if ((age > 25 && age < 35) && (health==("excellent")) && (locality==("city")) && (gender==("female")) && (policyamount <= 100000))
	 {
            premium = (policyamount * 3) / 1000;
	    max_amount=(200000*3)/1000;

        }
	 else if ((age > 25 && age < 35) && (health==("poor")) && (locality==("village")) && (gender==("male")) && (policyamount <= 10000)) 
	{
            premium = (policyamount * 6) / 1000;
	    max_amount=(200000*6)/1000;

        }

        if (premium > 0)
	{
            System.out.println("INSURED");
            System.out.println("Premium is: " + premium);
            System.out.println("Max amount :" +max_amount);
	    System.out.println("Loss : "   +(max_amount-premium));
        } 
	else
	 {
            System.out.println("NOT INSURED");
        }
    }
}
