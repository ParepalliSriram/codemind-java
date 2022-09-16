import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int i,j,k=0,l;
        for(i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                k+=1;
            }
        }
        System.out.print(k);
    }
}