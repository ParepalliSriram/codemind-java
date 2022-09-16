import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l;
        for(i=0;i<a;i++)
        {
            int b=sc.nextInt(),c;
            for(l=1;l<=b/2;l++)
            {
                if(l*l==b)
                {
                    k+=1;
                    break;
                }
            }
            if(k==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            k=0;
        }
    }
}