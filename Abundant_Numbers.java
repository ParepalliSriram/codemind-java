import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l=1,p,r;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                k+=i;
            }
        }
        if(k>a)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}