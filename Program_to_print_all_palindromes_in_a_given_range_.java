import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,k=0,l,m=0,n,o,p;
        for(i=a;i<=b;i++)
        {
            l=i;
            while(l!=0)
            {
                n=l%10;
                l=l/10;
                k=k*10+n;
            }
            if(k==i)
            {
                System.out.print(i+" ");
            }
            k=0;
        }
    }
}