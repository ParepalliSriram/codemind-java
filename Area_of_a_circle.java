import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        a=sc.nextFloat();
        System.out.printf("%.2f",(3.14*(a*a)));
        sc.close();
    }
}