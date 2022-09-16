import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l;
        for(i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(b+c);
        }
    }
}