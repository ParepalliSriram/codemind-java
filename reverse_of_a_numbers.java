import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            k=k*10+i;
        }
        System.out.print(k);
    }
}