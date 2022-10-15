import java.util.Scanner;
class Triplets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int b3=sc.nextInt();
        int alice=0,bob=0;
        if(a1>b1)
        {
            alice+=1;
        }
        if(a2>b2)
        {
            alice+=1;
        }
        if(a3>b3)
        {
            alice+=1;
        }
        if(a1<b1)
        {
            bob+=1;
        }
        if(a2<b2)
        {
            bob+=1;
        }
        if(a3<b3)
        {
            bob+=1;
        }
        System.out.print(alice+" "+bob);
    }
}