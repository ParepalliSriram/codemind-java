import java.util.Scanner;
class First
{
    public static int reve(int a)
    {
        int i,j,k=0;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            k=k*10+i;
        }
        return k;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,l,m=0,n,p,q,r=0,s,count=0;
        if(a<0)
        {
            a=a*(-1);
        }
        n=a;
        while(n!=0)
        {
            l=n%10;
            n=n/10;
            m+=1;
        }
        p=a*a;
        while(p!=0)
        {
            q=p%10;
            p=p/10;
            count+=1;
            if(count<=m)
            {
                r=r*10+q;
            }
        }
        s=reve(r);
        if(s==a)
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
    }
}