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
            for(int k=a;k>=i;k--)
            {
                System.out.print((char)(64+b)+" ");
            }
            b-=1;
            System.out.println();
        }
    }
}