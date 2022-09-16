import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,m=0,n,o,p;
        for(i=a+1;i<=100000;i++)
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
                for(o=1;o<=k;o++)
                {
                    if(k%o==0)
                    {
                        m+=1;
                    }
                }
                if(m==2)
                {
                    System.out.print(k);
                    break;
                }
                m=0;
            }
            k=0;
        }
    }
}