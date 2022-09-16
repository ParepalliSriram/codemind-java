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
        if(a<0)
        {
            System.out.print("Not Ugly Number");
        }
        else
        {
            int i,j,k=0,l;
            for(i=1;i<=a;i++)
            {
                if(a%i==0)
                {
                    if(primee(i)==1)
                    {
                        if(i!=2 && i!=3 && i!=5)
                        {
                            System.out.print("Not Ugly Number");
                            k+=1;
                            break;
                        }
                    }
                }
            }
            if(k==0)
            {
                System.out.print("Ugly Number");
            }
        }
    }
}