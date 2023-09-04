class Char_ASCII
{
public static void main(String args[])
{
	char n='a';
	int a=(int)(n);
	if((a>=65)&&(a<=92))
	{
		if((n=='A')||(n=='E')||(n=='I')||(n=='O')||(n=='U'))
		{
		System.out.println("VOWEL");
		}
		else
		{
		System.out.println("CONSONANT");
		}
	System.out.println("UPPER CASE CHARACTER");
	}

	else if((a>=97)&&(a<=122))
	{
		if((n=='a')||(n=='e')||(n=='i')||(n=='o')||(n=='u'))
		{
		System.out.println("VOWEL");
		}
		else
		{
		System.out.println("CONSONANT");
		}
	System.out.println("LOWER CASE CHARACTER");
	}

	else if((n=='0')||(n=='1')||(n=='2')||(n=='3')||(n=='4')||(n=='5')||(n=='6')||(n=='7')||(n=='8')||(n=='9'))
		{
		System.out.println("NUMERIC DIGIT");
		}
	else 
	{
		System.out.println("SPECIAL CHARACTER");
	}
}
}


