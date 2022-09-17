import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,k=0,l=1,p,r,f1=0,f2=0;
        for(i=1;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.println(a+" x "+i+" = "+a*i);
            }
        }
    }
}