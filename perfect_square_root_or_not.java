import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l;
        for(i=1;i<=a/2;i++)
        {
            if(i*i==a)
            {
                System.out.print("True");
                k+=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.print("False");
        }
    }
}