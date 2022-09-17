import java.util.Scanner;
class First
{
    public static int pali(int a)
    {
        int i,j,k=0,l,m=1,n=0;
        l=a;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            k=k*10+i;
        }
        if(k==l)
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
        int i,j,k=0,l=1,p,r,f1=0,f2=0;
        for(i=a+1;i<=a+1000;i++)
        {
            if(pali(i)==1)
            {
                f1=i;
                break;
            }
        }
        for(i=a-1;i>=1;i--)
        {
            if(pali(i)==1)
            {
                f2=i;
                break;
            }
        }
        if(f1-a==a-f2)
        {
            System.out.print(f2+" "+f1);
        }
        else if(f1-a<a-f2)
        {
            System.out.print(f1);
        }
        else
        {
            System.out.print(f2);
        }
    }
}