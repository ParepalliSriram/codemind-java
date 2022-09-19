import java.util.*;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l;
        for(i=a;i>0;i--)
        {
            for(l=1;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}