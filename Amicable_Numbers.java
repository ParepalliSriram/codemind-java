import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,k=0,l=0,m;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                k+=i;
            }
        }
        for(i=1;i<b;i++)
        {
            if(b%i==0)
            {
                l+=i;
            }
        }
        if(l==a && k==b)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}