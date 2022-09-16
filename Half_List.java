import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int i,j,k=0;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=a-1;i>=a/2;i--)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<a/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}