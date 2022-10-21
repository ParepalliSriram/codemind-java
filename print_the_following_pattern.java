import java.util.Scanner;
class Firt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int k=0;k<a;k++)
            {
                if(i==k)
                {
                    System.out.print("x");
                }
                else if(k==a-i-1)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}