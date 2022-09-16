import java.util.Scanner;
class First
{
    public static int primee(int a)
    {
        int i,j,k=0,m=0,n=1;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                k+=1;
            }
        }
        if(k==2)
        {
            return n;
        }
        else
        {
            return m;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k,l,m=0,n=0;
        for(i=a;i<=a+100;i++)
        {
            if(primee(i)==1)
            {
                m=i;
                break;
            }
        }
        for(i=a;i>=1;i--)
        {
            if(primee(i)==1)
            {
                n=i;
                break;
            }
        }
        k=m-a;
        l=a-n;
        if(k<=l)
        {
            System.out.print(k);
        }
        else
        {
            System.out.print(l);
        }
    }
}