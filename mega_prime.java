import java.util.Scanner;
class First
{
    public static int primee(int a)
    {
        int i,j,k=0,m=1,n=0;
        if(a<=1)
        {
            return n;
        }
        else
        {
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
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,l,m=0,n=0;
        if(primee(a)==1)
        {
            while(a!=0)
            {
                l=a%10;
                a=a/10;
                m+=1;
                if(primee(l)==1)
                {
                    n+=1;
                }
            }
            if(m==n)
            {
                System.out.print("Mega Prime");
            }
            else
            {
                System.out.print("Not Mega Prime");
            }
        }
        else
        {
            System.out.print("Not Mega Prime");
        }
    }
}