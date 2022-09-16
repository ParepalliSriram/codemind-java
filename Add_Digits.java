import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l;
        while(a>9)
        {
            while(a!=0)
            {
                i=a%10;
                a=a/10;
                k+=i;
            }
            a=k;
            k=0;
        }
        System.out.print(a);
    }
}