import java.util.*;
class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0 && b%2==0)
        {
            System.out.println("YES");
        }
        else if(a==0 && b%2!=0)
        {
            System.out.println("NO");
        }
        else if(((a)+(b*2))%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
