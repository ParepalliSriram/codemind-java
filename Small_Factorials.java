import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=1,l;
        for(i=0;i<a;i++)
        {
            int b=sc.nextInt();
            for(l=b;l>=1;l--)
            {
                k=k*l;
            }
            System.out.println(k);
            k=1;
        }
    }
}