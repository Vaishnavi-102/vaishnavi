class ICE
{
public static void main(String bargs[])
{
     int a,b,c,d;
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a");
        int num = sc.nextInt();
 
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter b");
        int num = sc.nextInt();
 
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter c");
        int num = sc.nextInt();
        
if(a>b)
{
d=a;
a=b;
b=d;
}
if(a>c)
{
d=a;
a=c;
c=d;
}
if(b>c)
{
d=c;
c=b;
b=d;
}
else
{
System.out.println("False order");
}
System.out.println("AFTER SWAPPING");
System.out.println("A  :" +a);
System.out.println("B  :" +b);
System.out.println("C  :" +c);
}
}
