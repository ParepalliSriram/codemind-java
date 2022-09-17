import java.util.Scanner;
class First
{
    public static int pali(int a)
    {
        int i,j,k=0,l,m=1,n=0;
        l=a;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            k=k*10+i;
        }
        if(k==l)
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
        int i,j,k=0,l=1,p,r;
        if(pali(a)==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}