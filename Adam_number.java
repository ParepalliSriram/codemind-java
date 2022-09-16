import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,m,s1,s2,p,q=0;
        m=a;
        s1=a*a;
        while(m!=0)
        {
            i=m%10;
            m=m/10;
            k=k*10+i;
        }
        s2=k*k;
        l=s2;
        while(l!=0)
        {
            p=l%10;
            l=l/10;
            q=q*10+p;
        }
        if(q==s1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}