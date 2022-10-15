import java.util.Scanner;
class sc
{
    public static boolean prime(int a)
    {
        if(a<2)
        {
            return false;
        }
        else
        {
            for(int i=2;i*i<=a;i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++)
        {
            if(prime(i))
            {
                count+=1;
            }
        }
        System.out.print(count);
    }
}