import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,k=0,l,m,n=0,o;
        m=a+b;
        for(i=1;i<=200;i++)
        {
            l=m+i;
            for(o=1;o<=l;o++)
            {
                if(l%o==0)
                {
                    n+=1;
                }
            }
            if(n==2)
            {
                System.out.print(i);
                break;
            }
            n=0;
        }
    }
}