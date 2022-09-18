import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l=0;
        while(true)
        {
            while(a!=0)
            {
                i=a%10;
                a=a/10;
                k+=(i*i);
                
            }
            if(k<10)
            {
                if(k==1 || k==7)
                {
                    System.out.print("True");
                    break;
                }
                else
                {
                    System.out.print("False");
                    break;
                }
            }
            a=k;
            k=0;
        }
    }
}