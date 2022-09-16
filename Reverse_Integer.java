import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,l,m=0,n;
        l=a;
        if(l<0)
        {
            l=l*(-1);
        }
        while(l!=0)
        {
            n=l%10;
            l=l/10;
            m=m*10+n;
        }
        if(a<0)
        {
            System.out.print(m*(-1));
        }
        else
        {
            System.out.print(m);
        }
    }
}