import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,j,k;
        float i,c=0;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            c+=(1/i);
        }
        System.out.format("%.2f",c);
    }
}