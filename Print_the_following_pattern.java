import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        for(int i=1;i<=a;i++)
        {
            for(int k=1;k<=a;k++)
            {
                if(k==i || k==a-i+1)
                {
                    System.out.print(b+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            b-=1;
            System.out.println();
        }
    }
}