class Steel
{
public static void main(String args[])
{
	int hardness=67;
	double carbon=0.4;
	int strength=2000;
	if((hardness>50)&&(carbon<0.7)&&(strength>5600))
	{
	System.out.println("Grade : 10");
	}
	else if((hardness>50)&&(carbon<0.7)||(strength>5600))
	{
	System.out.println("Grade : 9");
	}
	else if((carbon<0.7)&&(strength>5600)||(hardness>50))
	{
	System.out.println("Grade : 8");
	}
	else if((hardness>50)&&(strength>5600)||(carbon<0.7))
	{
	System.out.println("Grade : 7");
	}
	else if((hardness>50)||(strength>5600)||(carbon<0.7))
	{
	System.out.println("Grade : 6");
	}
	else
	{
	System.out.println("Grade : 5");
	}
}
}

