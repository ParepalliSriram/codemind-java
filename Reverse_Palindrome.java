import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),z=0;
        while(z>=0)
        {
            int i,j,k=0,l,m;
            l=n;
            while(n!=0)
            {
                i=n%10;
                n=n/10;
                k=k*10+i;
            }
            m=l+k;
            int p,q=0,r;
            r=m;
            while(m!=0)
            {
                p=m%10;
                m=m/10;
                q=q*10+p;
            }
            if(r==q)
            {
                System.out.print(r);
                break;
            }
            n=r;
        }
    }
}