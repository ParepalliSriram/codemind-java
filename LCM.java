import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,l,m=0,n=0;
        for(i=a;i<=a+10000;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}