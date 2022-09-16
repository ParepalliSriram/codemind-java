import java.util.Scanner;
class First
{
    public static int primee(int a)
    {
        int i,j,k=0,m=1,n=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                k+=1;
            }
        }
        if(k==2)
        {
            return m;
        }
        else
        {
            return n;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(primee(a)==1)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not a prime");
        }
    }
}