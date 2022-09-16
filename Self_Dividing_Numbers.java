import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,k=0,l,m,n=0;
        for(i=a;i<=b;i++)
        {
            l=i;
            
            while(l!=0)
            {
                m=l%10;
                l=l/10;
                if(m!=0)
                {
                    if(i%m==0)
                    {
                        k+=1;
                    }
                }
                n+=1;
            }
            if(k==n)
            {
                System.out.print(i+" ");
            }
            n=0;
            k=0;
        }
    }
}