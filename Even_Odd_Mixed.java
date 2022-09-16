import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,m=0,n=0,o,p;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            n+=1;
            if(i%2==0)
            {
                k+=1;
            }
            else
            {
                m+=1;
            }
        }
        if(k==n)
        {
            System.out.print("Even");
        }
        else if(m==n)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}