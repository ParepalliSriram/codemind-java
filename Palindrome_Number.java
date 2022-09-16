import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,l,m=0,n;
        for(i=0;i<a;i++)
        {
            int b=sc.nextInt();
            l=b;
            while(l!=0)
            {
                n=l%10;
                l=l/10;
                m=m*10+n;
            }
            if(m==b)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            m=0;
        }
    }
}