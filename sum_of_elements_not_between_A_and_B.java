import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int i,j,k=0,l;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(arr[i]>=b && arr[i]<=c)
            {
                continue;
            }
            else
            {
                k+=arr[i];
            }
        }
        System.out.print(k);
    }
}