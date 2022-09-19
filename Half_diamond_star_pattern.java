import java.util.*;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<3)
        {
            System.out.print("The pattern is not possible");
        }
        else
        {
            int i,j,k=0,l;
            for(i=1;i<=a;i++)
            {
                for(l=1;l<=i;l++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(i=a-1;i>0;i--)
            {
                for(l=1;l<=i;l++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}