import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,k=0,l;
        for(i=a;i<=b;i++)
        {
            for(l=1;l<=i;l++)
            {
                if(i%l==0)
                {
                    k+=1;
                }
            }
            if(k==2)
            {
                System.out.println(i);
            }
            k=0;
        }
    }
}