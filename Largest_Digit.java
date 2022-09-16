import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[100];
        int i,j,k=0,l,max=0;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            if(i>max)
            {
                max=i;
            }
        }
        System.out.print(max);
    }
}