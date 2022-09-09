import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        float d,e;
        d=(a+b+c)/2;
        e=(d)*(d-a)*(d-b)*(d-c);
        System.out.printf("%.2f",Math.sqrt(e));
        sc.close();
    }
}