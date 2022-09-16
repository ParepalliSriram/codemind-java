import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,s,p,m,f1=0,f2=0;
        for(i=0;i<a;i++)
        {
            int b=sc.nextInt();
            for(l=b;l>=1;l--)
            {
                for(s=1;s<=l;s++)
                {
                    if(l%s==0)
                    {
                        k+=1;
                    }
                }
                if(k==2)
                {
                    f1=l;
                    break;
                }
                k=0;
            }
            k=0;
            for(l=b;l<=b+1000;l++)
            {
                for(s=1;s<=l;s++)
                {
                    if(l%s==0)
                    {
                        k+=1;
                    }
                }
                if(k==2)
                {
                    f2=l;
                    break;
                }
                k=0;
            }
            if(b-f1==f2-b)
            {
                System.out.println(f1);
            }
            else if(b-f1<f2-b)
            {
                System.out.println(f1);
            }
            else
            {
                System.out.println(f2);
            }
        }
    }
}