import java.util.Scanner;
class Firt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int k=a;k>0;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}