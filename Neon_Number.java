import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,s=0,p=1,m;
        m=a*a;
        while(m!=0)
        {
            i=m%10;
            m=m/10;
            s+=i;
        }
        if(s==a)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
    }
}