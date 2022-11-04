import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),c=0;
        for(int i=0;i<=a/2;i++)
        {
            if(i*i==a)
            {
                System.out.print("True");
                c+=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
    }
}