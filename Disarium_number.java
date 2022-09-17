import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l=1,p,r;
        double q=0;
        r=a;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            k=k*10+i;
        }
        while(k!=0)
        {
            p=k%10;
            k=k/10;
            q+=Math.pow(p,l);
            l+=1;
        }
        if(q==r)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}