import java.lang.Math;
class Sqrt
{
public static void main(String args[])
{
int number=100;
double x = Math.sqrt(number); 
if(x == (int)x)  
{  
System.out.println(number+" is a perfect square.");  
}  
else  
{  
System.out.println(number+" is not a perfect square.");  
}  
}
}
